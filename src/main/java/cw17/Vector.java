package cw17;

import java.util.Arrays;

public class Vector {
    private int[] values;
    private int capasity;

    public void show() {
        System.out.println(Arrays.toString(values));
    }

    public Vector(int[] values) {
        this.values = values;
        capasity = values.length;
    }

    public void add(int var) {
        if (capasity == values.length) {
            values = Arrays.copyOf(values, values.length * 3 / 2 + 1);
        }
        values[capasity] = var;
        capasity++;
    }


    public void remove(int var) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == var) {
                values[i] = 0;
            }
        }
    }

    public void removeAt(int index) {
        if (index < values.length) {
            values[index] = 0;
        }
    }

    public void sort() {
        Arrays.sort(values);

    }

    public boolean find(int var) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == var) {
                return true;
            }
        }
        return false;
    }
}
