package cw7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        zad4();
    }

    private static void zad1() {
        char ch1 = 'A';
        if (ch1 <= 'G') {
            System.out.println("znak A-G");
        } else {
            System.out.println("znak H-Z");
        }
    }

    private static void zad2() {
        int s = 0;
        int i = 1;
        while (i <= 10) {
            s += 1;
            i++;
        }
    }

    private static void zad3() {
        int num = new Scanner(System.in).nextInt();
        for (int i = 31; i >= 0; i--) {
            if ((num & 1 << i) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
    }

    private static void zad4() {
        int size = 66;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((j >= i && (size - 1) - j >= i) || (i >= (size / 2) && j <= i && size - 1 - j <= i)) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
