package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmptyPriorityQueueTest {

    EmptyPriorityQueue testPQ1;
    EmptyPriorityQueue testPQ2;
    NonEmptyPriorityQueue testPQ3;

    NonEmptyPriorityQueue testPQ4;


    @BeforeEach
    void setUp() {
        testPQ1 = new EmptyPriorityQueue();
        testPQ2 = new EmptyPriorityQueue();
        testPQ3 = new NonEmptyPriorityQueue(1, "test", testPQ1);
        testPQ4 = new NonEmptyPriorityQueue(2, "test1", testPQ1);
    }


    @Test
    void isEmpty() {
        assertTrue(testPQ1.isEmpty());
        assertFalse(testPQ3.isEmpty());
    }

    @Test
    void add() {
        assertEquals(testPQ3, testPQ1.add(1, "test"));
        assertEquals(testPQ4, testPQ1.add(2, "test1"));

    }

    @Test
    void peek() {
        assertThrows(IllegalQueueOperationException.class, () -> testPQ1.peek());
        assertEquals("test", testPQ3.peek());
    }

    @Test
    void pop() {
        assertThrows(IllegalQueueOperationException.class, () -> testPQ1.pop());

    }
}