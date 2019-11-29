package cw10;

import java.util.*;

public class Cw10 {
    public static void main(String[] args) {
        zad4();
    }


    private static void zad1() {
        double[] array = new double[10];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextDouble();
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Sum = " + sum);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if ((int) array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
    }

    private static void zad2() {
        Character[] charArray = new Character[3];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) new Random().nextInt(129);
        }
        System.out.println(Arrays.toString(charArray));
        Character min = Character.MAX_VALUE;
        int index = charArray.length - 1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] < min) {
                min = charArray[i];
                index = i;
            }
        }
        System.out.println(index + " znak:" + min);
    }

    private static void zad3() {
        Scanner sc = new Scanner(System.in);
        Character[] array = new Character[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) ((int) (Math.random() * (('Z') - ('A') + 1) + ('A')));
        }
        while (checkArray(array)) {
            System.out.println(Arrays.toString(array));
            removeIfExist(array, sc.next().charAt(0));
        }

    }

    private static void removeIfExist(Character[] arr, Character input) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                arr[i] = ' ';
            }
        }
    }

    private static boolean checkArray(Character[] arr) {
        for (char c : arr) {
            if (c != ' ')
                return true;
        }
        return false;
    }

    private static void zad4() {
        int[] mrArray = new int[(int) (Math.random() * (15 - 10 + 1) + 10)];
        for (int i = 0; i < mrArray.length; i++) {
            mrArray[i] = i;
        }
        for (int i = 0; i < mrArray.length; i++) {
            for (int j = 0; j < mrArray.length; j++) {
                if (mrArray[j] == j) {
                    System.out.print("*");
                } else {
                    System.out.println(".");
                }
            }
            System.out.println();
        }

    }
}
