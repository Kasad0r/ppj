package cw18;

public class Walec {
    private int promien;
    private int wysocosc;

    public Walec(int promien, int wysocosc) {
        this.promien = promien;
        this.wysocosc = wysocosc;
    }

    public void show() {
        System.out.println(Math.PI * Math.pow(promien, 2) * wysocosc);
        System.out.println(Math.PI * Math.pow(promien, 2));
    }
}
