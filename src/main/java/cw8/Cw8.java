package cw8;

public class Cw8 {
    public static void main(String[] args) {
        int crypt = 1212501072;
        int znak1 = 1212501072 >> 8;
        int znak2 = znak1 >> 16;
        int znak3 = znak2 >> 24;
        int znak4 = 1212501072 >> 34;
        System.out.println((char) znak1);
        System.out.println((char) znak2);
        System.out.println((char) znak3);
        zad4();
    }

    private static void zad1() {

    }

    private static void zad3() {
        for (int j = 0; j < 5; j++) {
            for (int i = 5 - j; i > 1; i--) {
                System.out.print(".");
            }
            for (int i = 0; i < j + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void zad4() {
        int crypt = 1212501072;
        int znak0 = crypt >> 24;
        int znak1 = crypt << 24 ;
        znak1 = crypt >> 24;
        int znak2 = crypt << 16;
        znak2 = znak2 >> 24;
        int znak3 = crypt << 8;
        znak3 = znak3 >> 24;
        System.out.println((char) (znak1));
        System.out.println((char) znak3);
        System.out.println((char) znak2);
        System.out.println((char) znak0);
        int wrt = 1212501072;
        System.out.println();
        for (int i = 0, mask = 0b11111111, shift = 8 * 3; i < 4; i++, shift -= 8) {

            int subResutl = wrt >> shift;
            subResutl &= mask;
            char resutl = (char) subResutl;
            System.out.println(resutl);
        }

    }

    private static void zad5() {
        char ch1 = 'A';
        char ch2 = 'N';
        char ch3 = 'T';
        char ch4 = 'N';

        int crypt1 = ch1;
        int crypt2 = ch1;
        int crypt3 = ch1;
        int crypt4 = ch1;
        crypt1 += ch1;
        crypt1 = crypt1 << 23;
        crypt2 += ch2;
        crypt2 = crypt2 << 15;
        crypt3 += ch3;
        crypt3 = crypt3 << 7;
        crypt4 = ch4;
        int result = 0;
        result = crypt1 | crypt2 | crypt3 | crypt4;
        System.out.println(result);
    }
}
