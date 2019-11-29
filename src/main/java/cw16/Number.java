package cw16;

import java.util.Arrays;

public class Number {
    private int number;

    public void setValue(int value) {
        System.out.println("INPUT VALUE " + value);
        this.number = value;
        System.out.println("VAR MODIFIED TO " + number);
    }

    public void showValue() {
        int arr[] = {};
        System.out.println(Arrays.toString(arr));
        System.out.println(number);
    }

    public static void main(String[] args) {
        
    }
}
