package problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Class NationalParkDirectory contains information about a directory of US national parks
 */
public class NationalParkDirectory implements NationalParkDirectoryInterface{

    private NationalPark[] parks;

    private Integer size;

    /**
     * Constructor for NationalParkDirectory
     */
    public NationalParkDirectory() {


        this.parks = new NationalPark[100];

        this.size = 0;
    }

    /**
     * @return array of national parks in the directory
     */
    public NationalPark[] getParks() {
        return parks;
    }

    /**
     * @return number of national parks in the directory
     */
    public Integer getSize() {
        return size;
    }

    /**
     * @return new empty NationalParkDirectory
     */
    public Boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * @return number of national parks in the directory
     */
    public Integer count() {
        return this.size;
    }

    /**
     * @param park national park to check
     * @return
     */
    public Boolean contains(NationalPark park){
        for (int i =0; i < this.size;i++){
            if (this.parks[i].equals(park)) return true;

        }
        return false;
    }

    /**
     * @param park national park to add
     *             adds a national park to the directory
     */
    public void addNationalPark(NationalPark park){
        if (!this.contains(park)){
            if (this.size >= this.parks.length){
                NationalPark[] newParks = new NationalPark[this.size*2];
                for (int i = 0; i < this.size; i++){
                    newParks[i] = this.parks[i];
                }
                this.parks = newParks;
            }
            this.parks[this.size] = park;
            this.size++;
        }

    }

    /**
     * @param park national park to remove
     * @throws NationalParkNotFoundException if the national park is not found in the directory
     */
    @Override
    public void removeNationalPark(NationalPark park) throws NationalParkNotFoundException {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (parks[i].equals(park)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new NationalParkNotFoundException("NationalPark not found in the directory!");
        } else {
            System.arraycopy(parks, index + 1, parks, index, size - index - 1);
            size--;
        }
    }


    /**
     * @param state state to search for
     *              finds all national parks in the directory that are in the given state
     * @return
     */
    @Override
    public NationalPark[] findParksWithinTheState(String state) {
        NationalPark[] foundParks = new NationalPark[this.size];
        int foundCount = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.parks[i].getState().equals(state)) {
                foundParks[foundCount++] = this.parks[i];
            }
        }
        return Arrays.copyOf(foundParks, foundCount);

    }

    /**
     * @param nationalParkID national park ID to search for
     * @return national park with the given ID
     * @throws InvalidNationalParkIDException if the national park ID is not found in the directory
     */
    @Override
    public NationalPark getParkByID(String nationalParkID) throws InvalidNationalParkIDException{
        for (NationalPark park: this.parks){
            if (park.getNationalParkID().equalsIgnoreCase(nationalParkID)){
                return park;
            }
        }
        throw new InvalidNationalParkIDException("National Park ID not found");
    }

    /**
     * @param o object to compare
     * @return true if the two objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NationalParkDirectory that = (NationalParkDirectory) o;
        return size == that.size && Arrays.equals(parks, that.parks);
    }

    /**
     * @return hashcode of the object
     */
    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(parks);
        return result;
    }

    /**
     * @return string representation of the object
     */
    @Override
    public String toString() {
        return "NationalParkDirectory{" +
                "parks=" + Arrays.toString(parks) +
                ", size=" + size +
                '}';
    }
}





