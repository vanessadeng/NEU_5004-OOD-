package problem2;

import java.security.cert.CRLReason;
import java.util.Objects;

/**
 * Represents an item with its details--creator, title and year
 */
public abstract class Item {
    protected Creator creator;

    protected String title;
    protected Integer year;

    /**
     * @param creator the creator of the item
     * @param title  the title of the item
     * @param year  the year of publication of the item
     */
    public Item(Creator creator, String title, Integer year) {
        this.creator = creator;
        this.title = title;
        this.year = year;
    }

    /**
     * @return the creator of the item
     */
    public Creator getCreator() {
        return creator;
    }

    /**
     * @return the title of the item
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the year of publication of the item
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param o the object to be compared
     * @return true if the given object is equal to this object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(creator, item.creator) && Objects.equals(title, item.title) && Objects.equals(year, item.year);
    }

    /**
     * @return the hashcode of this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(creator, title, year);
    }
}
