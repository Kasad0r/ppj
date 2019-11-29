package cw3;

public class Cw3 {
    public static void main(String[] args) {
        System.out.println(0X245);
        System.out.println("-----ZD 1-----");
        zd1();
        System.out.println("-----ZD 2-----");
        zd2();
        System.out.println("-----ZD 3-----");
        zd3();
        System.out.println("-----ZD 4-----");
        zd4();
        System.out.println("-----ZD 5-----");
        zd5();
    }

    private static void zd1() {
        System.out.println("Podstawy Programowania Java");
    }

    private static void zd2() {
        int numb = 165;
        System.out.println("DECIMAL: " + numb);
        System.out.println("BINARY: " + Integer.toBinaryString(numb));
        System.out.println("OCTAL: " + Integer.toOctalString(numb));
        System.out.println("HEX: " + Integer.toHexString(numb));
    }

    private static void zd3() {
        System.out.println(" 14 >> 0: " + (14 >> 0));
        System.out.println(" 14 << 2: " + (14 << 2));
        System.out.println(" 14 << 4: " + (14 >> 2));
    }

    private static void zd4() {

        int a1 = 0b1110;
        int a2 = 0b1000;
        System.out.println("a1: " + a1 + "| a2:" + a2 + "| a1 & a2: " + (a1 & a2));
    }

    private static void zd5() {
        int a1 = 0b11001;
        int a2 = 0b00100;
        System.out.println("a1: " + a1 + "| a2:" + a2 + "| a1 | a2: " + (a1 | a2));
    }
}

