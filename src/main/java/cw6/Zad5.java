package cw6;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        byte x = -18;
        short y = -20;
        int z = 30;

        int wrt = new Scanner(System.in).nextInt();

        if (wrt > x && wrt <= -10 || wrt > -5 && wrt < 0 || wrt > 5 || wrt < 10) {
            System.out.println("WRT NALEZY A");
            if (/*wrt > Integer.MIN_VALUE &&*/ wrt <= y || wrt > -8 && wrt <= -3) {
                System.out.println("WRT NALEZY B");
                if (wrt >= z) {
                    System.out.println("WRT NALEZY Z");
                    System.out.println("WRT NALEZY DO WSZYSTKICH ZBIOROW");
                }
            }
        }

    }
}
