package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CatalogTest {
    Book testBook;
    Book testBook2;
    Music testMusic;
    Music testMusic2;
    Catalog testCatalog;
    Catalog testCatalog2;
    ArrayList<Item> testItemList;

    @BeforeEach
    void setUp() {
        testBook = new Book(new Author("John", "Doe"), "The Book", 1999);
        testBook2 = new Book(new Author("Rebecca", "Smith"), "The author", 1999);

        testMusic = new Music(new RecordingArtist("John", "Doe"), "The Music", 1999);
        testMusic2 = new Music(new RecordingArtist("Rebecca", "Smith"), "The Music", 1999);

        testItemList = new ArrayList<>(Arrays.asList(testBook, testMusic));

        testCatalog = new Catalog();
        testCatalog2 = new Catalog(testItemList);
    }

    @Test
    void addItem() {
        testCatalog.addItem(testBook);
        testCatalog.addItem(testMusic);
        assertEquals(testCatalog, testCatalog2);
    }

    @Test
    void removeItem() {
        testCatalog2.removeItem(testBook);
        Catalog testCatalog3 = new Catalog();
        testCatalog3.addItem(testMusic);
        assertEquals(testCatalog2, testCatalog3);

    }



    @Test
    void testSearch_Keyword() {
        ArrayList<Item> expectedItemList = new ArrayList<>(Arrays.asList(testBook, testMusic));
        assertEquals(expectedItemList, testCatalog2.search("The"));

    }

    @Test
    void testSearch_author() {
        Catalog testCatalog2 = new Catalog();
        testCatalog2.addItem(testBook);
        testCatalog2.addItem(testBook2);
        ArrayList<Item> expectedItemList = new ArrayList<>(Arrays.asList(testBook));
        assertEquals(expectedItemList, testCatalog2.search(new Author("John", "Doe")));
    }

    @Test
    void testSearch2() {
        Catalog testCatalog2 = new Catalog();
        testCatalog2.addItem(testMusic);
        testCatalog2.addItem(testMusic2);
        ArrayList<Item> expectedItemList = new ArrayList<>(Arrays.asList(testMusic));
        assertEquals(expectedItemList, testCatalog2.search(new RecordingArtist("John", "Doe")));
    }

    @Test
    void testEquals_Null() {
        assertFalse(testCatalog.equals(null));
    }

    @Test
    void testEquals_SameObjects() {
        assertTrue(testCatalog.equals(testCatalog));
    }

    @Test
    void testEquals_DifferentClass() {
        assertFalse(testCatalog.equals("test"));
    }
    @Test
    void testEquals_DifferentFields() {
        assertFalse(testCatalog.equals(testCatalog2));
    }




    @Test
    void testHashCode() {
        Catalog testCatalog2 = new Catalog();
        testCatalog2.addItem(testBook);
        testCatalog2.addItem(testMusic);
        Catalog testCatalog3 = new Catalog();
        testCatalog3.addItem(testBook);
        testCatalog3.addItem(testMusic);
        assertEquals(testCatalog3.hashCode(), testCatalog2.hashCode());
    }


}