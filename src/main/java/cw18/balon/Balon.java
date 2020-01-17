package cw18.balon;

public class Balon {

    private double pojemnosc;
    public Balon() {
        pojemnosc = (int) (Math.random() * ((9) - (5) + 1) + (5)) * 0.001;
    }

    public double podajUdzwig() {
        return pojemnosc * 6 / 0.007;
    }
}
