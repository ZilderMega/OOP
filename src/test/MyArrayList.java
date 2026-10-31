package test;

import java.util.Objects;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public String get(int index) {
        return array[index];
    }

    public void add(String element) {
        array[size] = element;
        size++;
        if (array.length == size) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
    }

    public void remove(String element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                remove(i);
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
