package problem2;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents a catalog with its details--item list
 */
public class Catalog {

    private ArrayList<Item> itemList;

    /**
     * @return the item list
     */
    public Catalog() {
        this.itemList = new ArrayList<>();
    }

    /**
     * @param itemList the item list
     */
    public Catalog(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    /**
     * @param item the item to be added
     * @return the item list
     */
    public void addItem(Item item) {
        this.itemList.add(item);
    }

    /**
     * @param item the item to be removed
     *             @return the item list
     */
    public void removeItem(Item item) {
        this.itemList.remove(item);
    }

    /**
     * @param keyword the keyword to be searched
     * @return the list of items that contain the keyword
     */
    public ArrayList<Item> search(String keyword) {
        ArrayList<Item> ans = new ArrayList<>();
        for (Item item : this.itemList) {
            if (item.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                ans.add(item);
            }
        }
        return ans;

    }

    /**
     * @param author the author to be searched
     * @return the list of items that contain the author
     */
    public ArrayList<Item> search(Author author){
        ArrayList<Item> ans = new ArrayList<>();
        for (Item item : this.itemList) {
            if (item.getCreator().equals(author)) {
                ans.add(item);
            }
        }
        return ans;
    }

    /**
     * @param recordingArtist the recording artist to be searched
     * @return the list of items that contain the recording artist
     */
    public ArrayList<Item> search(RecordingArtist recordingArtist){
        ArrayList<Item> ans = new ArrayList<>();
        for (Item item : this.itemList) {
            if (item.getCreator().containsArtist(recordingArtist)) {
                ans.add(item);
            }
        }
        return ans;
    }

    /**
     * @param band the band to be searched
     * @return the list of items that contain the band
     */
    public ArrayList<Item> search(Band band){
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : this.itemList) {
            if (item.getCreator().equals(band)) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * @param o the object to be compared
     * @return true if the given object is equal to this object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalog catalog = (Catalog) o;
        return Objects.equals(itemList, catalog.itemList);
    }

    /**
     * @return the hashcode of this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(itemList);
    }

    /**
     * @return the string representation of the object
     *
     */
    @Override
    public String toString() {
        return "Catalog{" +
                "itemList=" + itemList +
                '}';
    }
}
