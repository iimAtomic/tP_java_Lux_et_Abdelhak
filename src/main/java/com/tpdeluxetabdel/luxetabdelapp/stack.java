package com.tpdeluxetabdel.luxetabdelapp;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class stack<E> {
    private LinkedList<E> list = new LinkedList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(E item) {
        list.addFirst(item);
    }

    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.removeFirst();
    }

    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.peekFirst();
    }

    public int size() {
        return list.size();
    }
}
