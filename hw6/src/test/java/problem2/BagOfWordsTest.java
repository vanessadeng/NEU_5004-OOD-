package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagOfWordsTest {

    BagOfWords testBag1;
    BagOfWords testBag2;

    @BeforeEach
    void setUp() {
        testBag1 = new EmptyBagOfWords();
        testBag2 = new NonEmptyBagOfWords("test", testBag1);
        testBag2 = testBag2.add("test2");
        testBag2 = testBag2.add("test3");
        testBag2 = testBag2.add("test3");


    }

    @Test
    void emptyBagOfWords() {
        assertEquals(testBag1, testBag1.emptyBagOfWords());
    }

    @Test
    void isEmpty() {
        assertTrue(testBag1.isEmpty());
        assertFalse(testBag2.isEmpty());
    }

    @Test
    void size() {
        assertEquals(0, testBag1.size());
        assertEquals(4, testBag2.size());

    }

    @Test
    void add() {
        testBag1 = testBag1.add("test");
        testBag1 = testBag1.add("test2");
        testBag1 = testBag1.add("test3");
        assertEquals(3, testBag1.size());

    }

    @Test
    void contains() {
        assertTrue(testBag2.contains("test"));
        assertFalse(testBag1.contains("test"));
    }

    @Test
    void testEquals() {
    	assertTrue(testBag1.equals(testBag1));
    	assertFalse(testBag1.equals(testBag2));
    	assertFalse(testBag1.equals(null));
    	assertFalse(testBag1.equals("test"));
    	assertFalse(testBag1.equals(new NonEmptyBagOfWords("test", testBag1)));
    	assertFalse(testBag1.equals(new NonEmptyBagOfWords("test2", testBag1)));
    	assertFalse(testBag1.equals(new NonEmptyBagOfWords("test3", testBag1)));
    	assertFalse(testBag1.equals(new NonEmptyBagOfWords("test", testBag2)));
    	assertFalse(testBag1.equals(new NonEmptyBagOfWords("test2", testBag2)));
    	assertFalse(testBag1.equals(new NonEmptyBagOfWords("test3", testBag2)));
    	assertTrue(testBag1.equals(new EmptyBagOfWords()));
    	assertTrue(testBag2.equals(testBag2));
    	assertFalse(testBag2.equals(testBag1));
    	assertFalse(testBag2.equals(null));
    	assertFalse(testBag2.equals("test"));
    	assertFalse(testBag2.equals(new NonEmptyBagOfWords("test", testBag1)));
    	assertFalse(testBag2.equals(new NonEmptyBagOfWords("test2", testBag1)));
    	assertFalse(testBag2.equals(new NonEmptyBagOfWords("test3", testBag1)));
    	assertFalse(testBag2.equals(new NonEmptyBagOfWords("test", testBag2)));
    	assertFalse(testBag2.equals(new NonEmptyBagOfWords("test2", testBag2)));
    	assertFalse(testBag2.equals(new NonEmptyBagOfWords("test3", testBag2)));
    	assertFalse(testBag2.equals(new EmptyBagOfWords()));
    }

    @Test
    void testHashCode() {
    	assertEquals(testBag1.hashCode(), testBag1.hashCode());
    	assertNotEquals(testBag1.hashCode(), testBag2.hashCode());
    	assertNotEquals(testBag1.hashCode(), new NonEmptyBagOfWords("test", testBag1).hashCode());
    	assertNotEquals(testBag1.hashCode(), new NonEmptyBagOfWords("test2", testBag1).hashCode());
    	assertNotEquals(testBag1.hashCode(), new NonEmptyBagOfWords("test3", testBag1).hashCode());
    	assertNotEquals(testBag1.hashCode(), new NonEmptyBagOfWords("test", testBag2).hashCode());
    	assertNotEquals(testBag1.hashCode(), new NonEmptyBagOfWords("test2", testBag2).hashCode());
    	assertNotEquals(testBag1.hashCode(), new NonEmptyBagOfWords("test3", testBag2).hashCode());
    	assertEquals(testBag1.hashCode(), new EmptyBagOfWords().hashCode());
    	assertEquals(testBag2.hashCode(), testBag2.hashCode());
    	assertNotEquals(testBag2.hashCode(), testBag1.hashCode());
    	assertNotEquals(testBag2.hashCode(), new NonEmptyBagOfWords("test", testBag1).hashCode());
    	assertNotEquals(testBag2.hashCode(), new NonEmptyBagOfWords("test2", testBag1).hashCode());
    	assertNotEquals(testBag2.hashCode(), new NonEmptyBagOfWords("test3", testBag1).hashCode());
    	assertNotEquals(testBag2.hashCode(), new NonEmptyBagOfWords("test", testBag2).hashCode());
    	assertNotEquals(testBag2.hashCode(), new NonEmptyBagOfWords("test2", testBag2).hashCode());
    	assertNotEquals(testBag2.hashCode(), new NonEmptyBagOfWords("test3", testBag2).hashCode());
    	assertNotEquals(testBag2.hashCode(), new EmptyBagOfWords().hashCode());
    }
    @Test
    void testToString(){
        	assertEquals("EmptyBagOfWords{}", testBag1.toString());


    }
}