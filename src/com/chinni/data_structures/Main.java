package com.chinni.data_structures;

import java.util.ArrayList;
import java.util.List;

class BinaryHeap<T extends Comparable<T>> {
    private List<T> heap;

    public BinaryHeap() {
        heap = new ArrayList<>();
    }

    public void insert(T element) {
        heap.add(element);
        heapifyUp();
    }

    public void remove(T element) {
        int index = heap.indexOf(element);
        if (index != -1) {
            int lastIndex = heap.size() - 1;
            swap(index, lastIndex);
            heap.remove(lastIndex);
            heapifyDown(index);
        }
    }

    private void heapifyUp() {
        int index = heap.size() - 1;
        while (hasParent(index) && getParent(index).compareTo(heap.get(index)) > 0) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    private void heapifyDown(int index) {
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && getRightChild(index).compareTo(getLeftChild(index)) < 0) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if (heap.get(index).compareTo(heap.get(smallerChildIndex)) < 0) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }

            index = smallerChildIndex;
        }
    }

    private boolean hasParent(int index) {
        return index > 0;
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private T getParent(int index) {
        return heap.get(getParentIndex(index));
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < heap.size();
    }

    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    private T getLeftChild(int index) {
        return heap.get(getLeftChildIndex(index));
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < heap.size();
    }

    private int getRightChildIndex(int index) {
        return 2 * index + 2;
    }

    private T getRightChild(int index) {
        return heap.get(getRightChildIndex(index));
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryHeap<Integer> heap = new BinaryHeap<>();

        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(2);
        heap.insert(7);

        System.out.println("Heap: " + heap);

        heap.remove(3);

        System.out.println("Heap after removing 3: " + heap);
    }
}
