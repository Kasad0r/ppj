package cw14;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Cw14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        // System.out.println(zad4(arr));
        zad5(arr, 'x');
    }

    private static int fact(int n) {
        System.out.println(n);
        if (n <= 1)
            return n;
        return n * fact(n - 2);
    }


    private static int parz(int n) {
        if (n % 2 == 0) {
            System.out.println(n);
        }
        if (n == 1) {
            return n;
        }
        return n * parz(n - 1);
    }

    private static int nieParz(int n) {
        if (n % 2 == 1) {
            System.out.println(n);
        }
        if (n == 1) {
            return n;
        }
        return n * nieParz(n - 1);
    }

    private static int zad4(int[] arr) {
        String bin = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining());
        return Integer.parseInt(bin, 2);
    }

    private static void zad5(int[] arr, char ch) {

        switch (ch) {
            case 'f':
                break;
            case 's':
                break;
            case 'a':
                break;
            case 'r':
                System.out.println(Arrays.stream(arr));
                break;
            case 'm':
                int min = Arrays.stream(arr).min().getAsInt();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == min) {
                        System.out.println("MAX num index = " + i);
                    }
                }
                break;
            case 'x':
                int max = Arrays.stream(arr).max().getAsInt();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == max) {
                        System.out.println("MAX num index = " + i);
                    }
                }
                break;
            case 'h':
                System.out.println(Arrays.stream(arr).sum());
                break;
            case 't':
                int[] checkArr = new int[arr.length];
                System.arraycopy(arr, 0, checkArr, 0, arr.length);
                Arrays.sort(checkArr);
                System.out.println(Arrays.equals(arr, checkArr) ? "SORTED" : "NOT SORTED");

        }
    }
}