package main.chapter10;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this.elements = new int[DEFAULT_CAPACITY];
    }

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }

    public int getSize() {
        return size;
    }
}
