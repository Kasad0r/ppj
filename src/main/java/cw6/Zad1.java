
public class Zad1 {
    public static void main(String[] args) {
        byte a = (byte) 170;
        System.out.println((a & 0b00000001) == 1 ? "NIE PARZYSTA" : "PARZYSTA");
        if ((0b11111111 & 0b00000001) == 1) {
            System.out.println("NIE PARZYSTA KIEDY WSZYSKI 11111111");
        }
    }
}
