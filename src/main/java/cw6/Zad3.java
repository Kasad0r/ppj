package cw6;

public class Zad3 {
    public static void main(String[] args) {
        byte res = 0;
        byte pos = 1;
        byte counter = 0;
        while (counter < 8) {
            double random = Math.random();
            pos *= 2;
            if (random > 0.5) {

                res += pos;
            }
            counter++;
        }
        System.out.println(res);
    }
}
