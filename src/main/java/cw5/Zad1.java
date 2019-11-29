package cw5;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num > 0 ? ">" : "<");
        int numX = sc.nextInt();
        int numY = sc.nextInt();
        if (numX > numY) {
            System.out.println(num > sc.nextInt() && num <= sc.nextInt());
        } else System.out.println("Error: Y < X ");

        for (int i = 0; i < 3; i++) {
            int numXRand = (int) (Math.random() * 10 + 1);
            int numYRand =(int) (Math.random() * 10 + 1);
            System.out.println();
        }
    }
}
