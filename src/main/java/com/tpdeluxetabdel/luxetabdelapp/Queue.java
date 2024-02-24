package com.tpdeluxetabdel.luxetabdelapp;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<E> {
    private LinkedList<E> list;

    public Queue() {
        this.list = new LinkedList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(E item) {
        list.addLast(item);
    }

    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.removeFirst();
    }

    public E front() {
        if (isEmpty()) {
            return null;
        }
        return list.peekFirst();
    }

    public int size() {
        return list.size();
    }
}
