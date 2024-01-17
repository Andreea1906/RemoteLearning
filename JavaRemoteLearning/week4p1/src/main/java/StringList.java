package week4p1.src.main.java;

import java.util.Arrays;
import java.util.Objects;

public class StringList<T> implements List<T> {

    private static final int INITIAL_CAPACITY = 10;
    private Object[] array;
    private int size;

    public StringList() {
        this.array = new Object[INITIAL_CAPACITY];
        this.size = 0;

    }
    @Override
    public void add(T element) {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
        array[size++] = element;
    }

    @Override
    public T get(int position) {
        checkBounds(position);
        return (T) array[position];
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(element, array[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(List<T> foreignList) {
        for (int i = 0; i < foreignList.size(); i++) {
            if (!contains(foreignList.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return size;
    }


    private void checkBounds(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + position);
        }
    }
}
