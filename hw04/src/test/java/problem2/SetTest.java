package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set mySet;


    @BeforeEach
    public void setUp() {
        mySet = new Set(new Integer[100], 0);


    }

    @Test
    public void testEmptySet() {
        Set emptySet = mySet.emptySet();
        assertTrue(emptySet.isEmpty());

    }

    @Test
    public void testAdd() {
        mySet = mySet.add(1);
        assertTrue(mySet.contains(1));
        assertEquals(1, mySet.size());

        // Test adding the same number again (set should ignore this)
        mySet = mySet.add(1);
        assertTrue(mySet.contains(1));
        assertEquals(1, mySet.size());

        // Test adding a different number
        mySet = mySet.add(2);
        assertTrue(mySet.contains(2));
        assertEquals(2, mySet.size());






    }

    @Test
    public void testRemove() {
        mySet.add(1);
        mySet.remove(1);
        assertTrue(mySet.isEmpty());
        assertFalse(mySet.contains(1));


    }

    @Test
    public void testEquals_Null() {
        assertFalse(mySet.equals(null));

    }

    @Test
    public void testEquals_Same() {
        assertTrue(mySet.equals(mySet));

    }

    @Test
    public void testSize() {
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        assertEquals(3, mySet.size());

    }

    @Test
    public void testContains() {
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        assertTrue(mySet.contains(1));
        assertTrue(mySet.contains(2));
        assertTrue(mySet.contains(3));
        assertFalse(mySet.contains(4));

    }

    @Test
    public void testRemove2() {
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.remove(1);
        assertFalse(mySet.contains(1));
        assertTrue(mySet.contains(2));
        assertTrue(mySet.contains(3));
        assertEquals(2, mySet.size());

    }





    }

