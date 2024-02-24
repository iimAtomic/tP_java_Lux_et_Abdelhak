package com.tpdeluxetabdel.luxetabdelapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest {
    private stack<String> stack;

    @BeforeEach
    public void setUp() {
        stack = new stack<>();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push("element");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPushAndPeek() {
        stack.push("element");
        assertEquals("element", stack.peek());
        assertEquals(1, stack.size());
    }

    @Test
    public void testPop() {
        stack.push("element");
        assertFalse(stack.isEmpty());
        assertEquals("element", stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, stack.size());
        stack.push("element");
        assertEquals(1, stack.size());
    }
}
