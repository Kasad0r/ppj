package cw9;

public class Test {
    public static void main(String[] args) {
zad4();
    }

    private static void zad1() {
        char ch = 'B';
        if (ch < 'G') {
            System.out.println("znak A-G");
        } else {
            System.out.println("H-Z");
        }
    }

    private static void zad2() {
        int s = 0;
        int i = 1;
        while (i <= 10) {
            s = s + i;
            i++;
        }
    }

    private static void zad3() {
/*
        int num = 23;
        int sum = 0;
        int stop = 1;
        for (int i = 4; i > 0; i--) {
            for (int j = 8; j > 0; j--) {
                if ((num &3) << (j * i - 1) != 0)
                    sum += 1;
            }
            int mag = Long.SIZE - numberOfLeadingZeros(num);
            int chars = Math.max(((mag + (4 - 1)) / 4), 1);
            char[] buf = new char[chars];
            int charPos = len;
            int radix = 1 << shift;
            int mask = radix - 1;
            do {
                buf[offset + --charPos] = Integer.digits[((int) val) & mask];
                val >>>= shift;
            } while (val != 0 && charPos > 0);

            System.out.println(Integer.toUnsignedString(23, 4));
        }
*/

    }
    public static int numberOfLeadingZeros(long i) {
        // HD, Figure 5-6
        if (i == 0)
            return 64;
        int n = 1;
        int x = (int)(i >>> 32);
        if (x == 0) { n += 32; x = (int)i; }
        if (x >>> 16 == 0) { n += 16; x <<= 16; }
        if (x >>> 24 == 0) { n +=  8; x <<=  8; }
        if (x >>> 28 == 0) { n +=  4; x <<=  4; }
        if (x >>> 30 == 0) { n +=  2; x <<=  2; }
        n -= x >>> 31;
        return n;
    }

    private static void zad4() {
        int size = 5;
        size = size * 2 + 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((j < i + 1 || (size - 3) - j < i - 1) &&
                        (j + 1 > i + 2 || (size - 3) - j + 2 > i - 1)
                        || size / 2 <= i && j + 1 > i
                        || (size / 2 == i)) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
