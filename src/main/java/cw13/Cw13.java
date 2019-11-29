package cw13;

import java.util.Arrays;
import java.util.Random;

public class Cw13 {
    private static void zad1(int n) {
        System.out.println(n);
    }

    public static void main(String[] args) throws InterruptedException {
        int wrt = 5;
        System.out.println(wrt);
        zad2ModifyValue(wrt);
        System.out.println(wrt);

        int[] intsOne = new Random().ints(15).toArray();
        int[] intsTwo = new Random().ints(15).toArray();

        zad5(intsOne, intsTwo, 1);
    }

    private static void zad2ModifyValue(int n) {
        n *= 5;
    }

    private static int zad3FindMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else return c;
    }

    private static int charCounter(char[] ch) {
        return ch.length;
    }

    private static void zad5(int[] a1, int[] a2, int arg) throws InterruptedException {
        for (int i = 0; i < 10000000; i++) {
            for (int j = 0; j < 1000; j++) {
                Thread.sleep(100);
                System.out.println("1");
            }
            System.out.println();
        }
    }
}
