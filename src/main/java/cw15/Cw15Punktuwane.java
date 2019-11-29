package cw15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Cw15Punktuwane {
    public static void main(String[] args) {
        zad3();
    }

    private static void zad1() {
        int i = new Scanner(System.in).nextInt();
        char ch = new Scanner(System.in).nextLine().charAt(0);
        drawXandO(i, ch);
    }

    private static void drawXandO(int length, char firstSymb) {
        char[][] arr = new char[length][length];
        arr[0][0] = firstSymb;
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                arr[i][0] = arr[i - 1][0] == 'X' ? 'O' : 'X';
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (j != 0) {
                    if (arr[i][j - 1] == 'X') {
                        arr[i][j] = 'O';
                    } else {
                        arr[i][j] = 'X';
                    }
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void zad2() {
        char[][] chars = arrayCharFill();

        findBiggestChars(chars);
    }

    public static void findBiggestChars(char[][] inputArray) {
        char[] charAlphabet = new char[4 * inputArray.length - 4];
        int indx = 0;
        for (int i = 0, j = 0; j < inputArray.length; j++) {
            charAlphabet[indx] = inputArray[i][j];
            indx++;
        }
        for (int i = 1, j = inputArray.length - 1; i < inputArray.length; i++) {
            charAlphabet[indx] = inputArray[i][j];
            indx++;
        }
        for (int i = inputArray.length - 1, j = inputArray.length - 2; j >= 0; j--) {
            charAlphabet[indx] = inputArray[i][j];
            indx++;
        }
        for (int i = inputArray.length - 2, j = 0; i >= 1; i--) {
            charAlphabet[indx] = inputArray[i][j];
            indx++;
        }


        for (int i = 0; i < charAlphabet.length; i++) {
            System.out.print(charAlphabet[i]+ " ");
        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = 2; i < charAlphabet.length; i++) {
            if (charAlphabet[i - 2] < charAlphabet[i - 1] && charAlphabet[i - 1] < charAlphabet[i]) {
                System.out.println(charAlphabet[i - 2] + " " + charAlphabet[i - 1] + " " + charAlphabet[i]);
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = charAlphabet.length - 3; i > -1; i--) {
            if (charAlphabet[i + 2] < charAlphabet[i + 1] && charAlphabet[i + 1] < charAlphabet[i]) {
                System.out.println(charAlphabet[i + 2] + " " + charAlphabet[i + 1] + " " + charAlphabet[i]);
            }
        }
    }

    private static char[][] arrayCharFill() {
        char[][] arr = new char[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (char) (Math.random() * ('z' - 'a' + 1) + 'a');
            }
        }
        return arr;

    }

    private static void zad3() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i1 = 0; i1 < arr.length; i1++) {
            arr[i1] = random.nextInt(100);
        }
        int[] minMax = maxAndMin(arr);
        System.out.println("MIN " + minMax[0] + " MAX " + minMax[1]);
        System.out.println(Arrays.toString(lowerThenMiddleElements(arr)));
    }

    /**
     * first return element min, second - max
     *
     * @param arr
     * @return
     */
    private static int[] maxAndMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }

    private static int[] lowerThenMiddleElements(int[] arr) {
        int[] resultArr;
        System.out.println(Arrays.toString(arr));
        int middleValue = Arrays.stream(arr).sum() / arr.length;
        System.out.println("MIDDLE VALUE "+ middleValue);
        int lowNumCounter = 0;
        for (int i : arr) {
            if (i < middleValue) {
                lowNumCounter++;
            }
        }
        resultArr = new int[lowNumCounter];
        int resultArrIndexer = 0;
        for (int i : arr) {
            if (i < middleValue) {
                resultArr[resultArrIndexer] = i;
                resultArrIndexer++;
            }
        }
        return resultArr;
    }

    /**
     * Udali skobku tbI cejczas ne w klase .
     * @return
     */
    private static int[] get2Sizes() {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        return new int[]{first, second};
    }

    private static void showTriangleArea(int arr[]) {
        System.out.println((arr[0] * arr[1]) / 2);
    }

    private static char[] zad5(int num) {
        String s = "";
        for (int i = 31; i >= 0; i--) {
            if ((num & 1 << i) != 0) {
                s+=("1");
            } else {
                s+="0";
            }
        }
        return s.toCharArray();
    }
}
