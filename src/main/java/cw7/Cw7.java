package cw7;

import java.util.Scanner;

public class Cw7 {
    public static void main(String[] args) {
        zad11();
    }

    private static void zad1() {
        byte wrt = new Scanner(System.in).nextByte();
        byte bt = 0b1000000;
        for (int i = 8; i >= 1; i--) {
            if ((wrt & bt) == 1) {
                System.out.println((int)Math.pow(2, i));
            }
            System.out.println(bt);
            bt = (byte) (bt >> 1);

        }
    }

    private static void zad2() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    private static void zad3() {
        int wrt = 1;
        for (int i = 1; i < 11; i++) {
            wrt *= i;
            System.out.println(wrt);
        }
        System.out.println("KONIEC = " + wrt);
    }

    private static void zad4() {
        int i = 10;
        while (i < 5) {
            System.out.println("NIE BEDZIE");
        }
        do {
            System.out.println("BEDZIE");
        } while (i < 5);
    }

    private static void zad5() {
        for (int n = 0; n < 10; n++) {
            System.out.println(1 / Math.pow(2, n));
        }
    }

    private static void zad6() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void zad7_1() {
        double inputX = -10;
        byte symb = 1;
        double sin = inputX;
        for (int num = 3; num <= 25; num += 2) {
            sin += symb * Math.pow(inputX, num) / fact(num);
            symb *= -1;
            System.out.println(sin);
        }

    }

    private static void zad7_2() {
        double inputX = -10;
        byte symb = 1;
        double cos = 1;
        for (int num = 2; num < 25; num += 2) {
            cos += symb * Math.pow(inputX, num) / fact(num);
            symb *= -1;
            System.out.println(cos);
        }

    }

    private static void zad8() {
        for (; ; ) {
            int n = new Scanner(System.in).nextInt();
            if (n >= 0 && n <= 999) {
                printNum(n);
            } else
                System.out.println("jakaś liczba za dużo liczyć");
        }
    }

    private static void printNum(int n) {
        int thirdNum = n / 100;
        int secondNum = n % 100 / 10;
        int firstNum = n % 10;
        switch (thirdNum) {
            case 1:
                System.out.print("STO ");
                break;
            case 2:
                System.out.print("DWIESCIE ");
                break;
            case 3:
                System.out.print("TRZYSTa ");
                break;
            case 4:
                System.out.print("CZTERYSTA ");
                break;
            case 5:
                System.out.print("PIECSET ");
                break;
            case 6:
                System.out.print("SZESCSET");
                break;
            case 7:
                System.out.print("SIEDEMSET");
                break;
            case 8:
                System.out.print("OCIEMSET");
                break;
            case 9:
                System.out.print("DZIEWIECSET");
        }
        if (secondNum == 1) {
            switch (n % 100) {
                case 10:
                    System.out.print("dziesięć ");
                    break;
                case 11:
                    System.out.print("jedenaście ");
                    break;
                case 12:
                    System.out.print("dwanaście ");
                    break;
                case 13:
                    System.out.print("trzynaście ");
                    break;
                case 14:
                    System.out.print("czternaście ");
                    break;
                case 15:
                    System.out.print("piętnaście");
                    break;
                case 16:
                    System.out.print("szesnaście");
                    break;
                case 17:
                    System.out.print("siedemnaście");
                    break;
                case 18:
                    System.out.print("osiemnaście");
                    break;
                case 19:
                    System.out.print("DZEWIETNASCIE");
            }
        } else {
            switch (secondNum) {
                case 2:
                    System.out.print("dwadzieścia ");
                    break;
                case 3:
                    System.out.print("trzydzieści ");
                    break;
                case 4:
                    System.out.print("czterdzieści ");
                    break;
                case 5:
                    System.out.print("pięćdziesiąt ");
                    break;
                case 6:
                    System.out.print("sześćdziesiąt ");
                    break;
                case 7:
                    System.out.print("siedemdziesiąt");
                    break;
                case 8:
                    System.out.print("osiemdziesiąt");
                    break;
                case 9:
                    System.out.print("dziewięćdziesiąt");
                    break;
            }
            switch (firstNum) {
                case 1:
                    System.out.println("jeden  ");
                    break;
                case 2:
                    System.out.println("dwa  ");
                    break;
                case 3:
                    System.out.println("trzy  ");
                    break;
                case 4:
                    System.out.println("cztery ");
                    break;
                case 5:
                    System.out.println("piec ");
                    break;
                case 6:
                    System.out.println("sześć");
                    break;
                case 7:
                    System.out.println("siedem");
                    break;
                case 8:
                    System.out.println("osiem");
                    break;
                case 9:
                    System.out.println("dziewięć");
                    break;
            }
        }
    }

    private static void zad9() {
        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z = false);
        System.out.println(x + ", " + y + ", " + z);
    }

    private static void zad10() {
        int K = 987654321;
        String s = "";
        while (K != 0) {
            int cyfra = K % 10;
            s = s + cyfra;
            K = K / 10;
        }
        System.out.println(s);
    }

    private static void zad11() {
        int i = 10;
        i = i++;
        i = ++i;
        i = i++ + ++i;
        System.out.println(i);
    }

    private static void zad12() {
        double a = 12.2;
        double x = 0;
        if (a >= 0) x = 1.701;
        if (a < 0) x = 2 * 3.14f;
        System.out.println(x);
    }

    private static int fact(int n) {
        if (n == 1)
            return n;
        return n * fact(n - 1);
    }
}
