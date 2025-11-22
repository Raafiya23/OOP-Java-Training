package com.MiniProject3.AlgorithmToolkit;

import java.util.LinkedList;

public class CollectionUtil<T> {
    private LinkedList<T> list = new LinkedList<>();

    /** Push - O(1) */
    public void push(T item) {
        list.addFirst(item);
    }

    /** Pop - O(1) */
    public T pop() {
        if (list.isEmpty()) return null;
        return list.removeFirst();
    }

    /** Enqueue - O(1) */
    public void enqueue(T item) {
        list.addLast(item);
    }

    /** Dequeue - O(1) */
    public T dequeue() {
        if (list.isEmpty()) return null;
        return list.removeFirst();
    }

    /** Check if empty */
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
