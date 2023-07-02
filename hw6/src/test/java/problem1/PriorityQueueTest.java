package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueTest {
    PriorityQueue testPQ1;
    PriorityQueue testPQ2;

    @BeforeEach
    void setUp() {
        testPQ1 = PriorityQueue.createEmpty();
        testPQ2 = PriorityQueue.createEmpty();
        testPQ2 = testPQ2.add(2, "sleep");
        testPQ2 = testPQ2.add(1, "eat");
    }

    @Test
    void createEmpty() {
        assertTrue(testPQ1.isEmpty());
        assertFalse(testPQ2.isEmpty());
    }

    @Test
    void isEmpty() {
        assertTrue(testPQ1.isEmpty());
        assertFalse(testPQ2.isEmpty());
    }

    @Test
    void add() {
        testPQ2 = testPQ2.add(3, "code");
        assertEquals("code", testPQ2.peek());
    }

    @Test
    void peek() {
        assertEquals("sleep", testPQ2.peek());
    }

    @Test
    void pop() {
        testPQ2 = testPQ2.pop();
        assertEquals("eat", testPQ2.peek());
    }
}