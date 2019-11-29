package cw6;

public class Zad4 {
    public static void main(String[] args) {
        int W = 16;
        int X = 5;
        int Y = 1;
        int Z = 19;
        int sum = W + X + Y + Z;
        if (sum > 0xA) {
            if ((W & 0b0010000) == 16)
                System.out.println(W);
            if ((X & 0b0010000) == 16) {
                System.out.println(X);
            }
            if ((Z & 0b0010000) == 16) {
                System.out.println(Z);
            }
            if ((Y & 0b0010000) == 16) {
                System.out.println(Z);
            }
        } else {
            if ((W & 0xA3) < 5)
                System.out.println(W);
            if ((X & 0xA3) < 5) {
                System.out.println(X);
            }
            if ((Z & 0xA3) < 5) {
                System.out.println(Z);
            }
            if ((Y & 0xA3) < 5) {
                System.out.println(Y);
            }

        }
    }
}
