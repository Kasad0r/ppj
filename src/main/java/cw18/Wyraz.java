package cw18;

public class Wyraz {
    private char[] arr;
    private int size;

    public Wyraz() {
        arr = new char[100];
        size = 0;
    }

    public void dodajZnak(char ch) {
        if (arr.length - 1 == size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            arr[size] = ch;
            size++;
        }
    }

    public void wyswietl() {
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}
