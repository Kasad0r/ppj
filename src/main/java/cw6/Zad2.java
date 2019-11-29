package cw6;

public class Zad2 {
    public static void main(String[] args) {
        double M1 = Math.random();
        double M2 = Math.random();
        double M3 = Math.random();
        double M4 = Math.random();
        double M5 = Math.random();

        if (M1 > 0.2 && M2 > 0.2 && M3 > 0.2) {
            System.out.println(M1 + " " + M2 + " " + M3);
            System.out.println(true);
        }
        if (M2 > 0.2 && M3 > 0.2 && M4 > 0.2) {
            System.out.println(M2 + " " + M3 + " " + M4);
            System.out.println(true);
        }
        if (M3 > 0.2 && M4 > 0.2 && M5 > 0.2) {
            System.out.println(M3 + " " + M4 + " " + M5);
            System.out.println(true);
        }
        if (M5 > 0.2 && M2 > 0.2 && M1 > 0.2) {
            System.out.println(M5 + " " + M1 + " " + M2);
            System.out.println(true);
        }
    }


}
