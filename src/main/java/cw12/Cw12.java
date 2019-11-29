package cw12;

import java.util.Arrays;
import java.util.Random;

public class Cw12 {
    public static void main(String[] args) {
        zad5();
    }

    private static void zad1() {
        char tab[] = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < tab.length / 2; i++) {
            char temp = tab[tab.length - i - 1];
            tab[tab.length - i - 1] = tab[i];
            tab[i] = temp;
        }
        System.out.println(Arrays.toString(tab));
    }

    private static void zad2() {
        int tab[] = {1, 2, 3, 4, 4, 3, 2, 1};
        boolean knox = true;
        for (int i = 0; i < tab.length / 2; i++) {
            if (tab[tab.length - 1 - i] != tab[i]) {
                knox = false;
            }
        }
        System.out.println(knox);
    }

    private static void zad4() {
        Random random = new Random();
        boolean[] boolArr = new boolean[20];
        for (int i = 0; i < 10; i++) {
            boolArr[i] = random.nextBoolean();
        }
        int trueCounter = 0;
        for (boolean value : boolArr) {
            if (value) {
                trueCounter++;
            }
        }
        boolean[] trueArr = new boolean[trueCounter];
        boolean[] falseArr = new boolean[boolArr.length - trueCounter];
        int trueArrCounter = 0;
        int falseArrCounter = 0;
        for (boolean b : boolArr) {
            if (b) {
                trueArr[trueArrCounter] = true;
                trueArrCounter++;
            } else {
                falseArr[falseArrCounter] = false;
                falseArrCounter++;
            }
        }
        System.out.println(Arrays.toString(boolArr));
        System.out.println(Arrays.toString(trueArr));
        System.out.println(Arrays.toString(falseArr));
    }

    private static void zad5() {
        int tab[][] = {
                {1, 2, 3, 4,3},
                {5, 6, 7, 8,2},
                {9, 10, 11, 12,1},
                {13, 14, 15, 16, 5},
                {1, 6, 8, 9, 0}
        };
        int position = 0;
        int line = 0;
        int column = 0;
        int lineMax = tab[0].length;
        int upperMax = tab.length;
        int[] result = new int[upperMax * lineMax];
        while (line < upperMax && column < lineMax) {
            int index;
            index = column;
            while (index < lineMax) {
                result[position++] = tab[index][line];
                ++index;
            }
            line++;
            index = line;
            while (index < upperMax) {
                result[position++] = tab[lineMax - 1][index];
                ++index;
            }
            lineMax--;
            if (line < upperMax) {
                index = lineMax - 1;
                while (index >= column) {
                    result[position++] = tab[index][upperMax - 1];
                    --index;
                }
                upperMax--;
            }
            if (column < lineMax) {
                index = upperMax - 1;
                while (index >= line) {
                    result[position++] = tab[column][index];
                    --index;
                }
                column++;
            }

        }
        System.out.println(Arrays.toString(result));
    }

    private static void zad3() {
        int[] arr = new int['z' - 'a' + 1];
        char[] input = {'q', 'b', 'a', 'b'};
        for (char c : input) {
            arr['z' - c] = arr['z' - c] + 1;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                System.out.println((char) ('z' - i) + " = " + arr[i]);
            }
        }
    }
}
