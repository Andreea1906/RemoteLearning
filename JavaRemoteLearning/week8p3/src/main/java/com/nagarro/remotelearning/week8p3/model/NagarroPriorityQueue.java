package com.nagarro.remotelearning.week8p3.model;

import java.util.HashMap;

public class NagarroPriorityQueue<E extends Comparable<E>> {
    private E[] heap;
    private int size;
    private HashMap<E, Integer> lookup;

    public NagarroPriorityQueue(int capacity) {
        heap = (E[]) new Comparable[capacity];
        size = 0;
        lookup = new HashMap<>();
    }

    public void insert(E value) {
        if (size == heap.length)
            throw new IllegalStateException("Priority queue is full");

        heap[size] = value;
        lookup.put(value, size);
        siftUp(size);
        size++;
    }

    public E remove() {
        if (size == 0)
            throw new IllegalStateException("Priority queue is empty");

        E largest = heap[0];
        swap(0, size - 1);
        size--;
        lookup.remove(largest);
        siftDown(0);
        return largest;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    private void siftUp(int index) {
        int parent = (index - 1) / 2;
        while (index > 0 && heap[index].compareTo(heap[parent]) > 0) {
            swap(index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    private void siftDown(int index) {
        int leftChild, rightChild, largestChild;
        while (index < size) {
            leftChild = 2 * index + 1;
            rightChild = 2 * index + 2;
            largestChild = index;

            if (leftChild < size && heap[leftChild].compareTo(heap[largestChild]) > 0)
                largestChild = leftChild;
            if (rightChild < size && heap[rightChild].compareTo(heap[largestChild]) > 0)
                largestChild = rightChild;

            if (largestChild != index) {
                swap(index, largestChild);
                index = largestChild;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        E temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
        lookup.put(heap[i], i);
        lookup.put(heap[j], j);
    }

}
