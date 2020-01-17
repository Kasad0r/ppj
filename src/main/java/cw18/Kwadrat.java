package cw18;

public class Kwadrat {
    public Kwadrat(int pole) {
        this.pole = pole;
    }

    private int pole;

    public void show() {
        System.out.println(pole * pole);
        System.out.println(pole * pole * pole);
    }
}
