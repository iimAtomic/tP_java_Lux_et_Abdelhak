package com.tpdeluxetabdel.luxetabdelapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

class QueueTest {
    Queue<String> var1, var2, var3;

    @BeforeEach
    public void setUp() {
        var1 = new Queue<>();

        var2 = new Queue<>();
        var2.push("abdel");

        var3 = new Queue<>();
        var3.push("a");
        var3.push("b");
    }

    @Test
    public void testIsEmpty() {
        assertTrue(var1.isEmpty());
        assertFalse(var2.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, var1.size());
        assertEquals(1, var2.size());
        assertEquals(2, var3.size());
    }

    @Test
    public void testPush() {
        var1.push("lux");
        assertFalse(var1.isEmpty());
        assertEquals(1, var1.size());
    }

    @Test
    public void testPop() {
        try {
            var1.pop();
            fail("Pop should throw an exception when the queue is empty");
        } catch (NoSuchElementException e) {
            // LuxException
        }
        assertEquals("abdel", var2.pop());
        assertTrue(var2.isEmpty());
        assertEquals("a", var3.pop());
        assertEquals("b", var3.pop());
        assertTrue(var3.isEmpty());
    }

    @Test
    public void testFront() {
        assertNull(var1.front());
        assertEquals("abdel", var2.front());
        assertFalse(var2.isEmpty());
        assertEquals("a", var3.front());
    }
}
