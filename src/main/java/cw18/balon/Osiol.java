package cw18.balon;

public class Osiol {
    private double masa;
    private Balon[] balons;
    private int balonsSize;

    public Osiol(double masa) {
        this.masa = masa;
        balons = new Balon[100];
        balonsSize = 0;
    }

    public void dodajBalon(Balon balon) {
        if (balons.length - 1 == balonsSize) {
            Balon[] temp = new Balon[balons.length * 3 / 2 + 1];
            System.arraycopy(balons, 0, temp, 0, balons.length);
            balons = temp;
        }
        balons[balonsSize] = balon;
        balonsSize++;
    }

    public boolean czyLata() {
        double udzwig = 0;
        for (int i = 0; i < balonsSize; i++) {
            udzwig += balons[i].podajUdzwig();
        }
        return udzwig > masa;
    }
}
