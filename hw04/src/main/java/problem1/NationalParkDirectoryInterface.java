package problem1;

/**
 * Interface NationalParkDirectoryInterface contains information about a directory of US national parks
 */
public interface NationalParkDirectoryInterface {

    /**
     * @return new empty NationalParkDirectory
     */
    Boolean isEmpty();

    /**
     * @return number of national parks in the directory
     */
    Integer count();

    /**
     * @param park national park to check
     * @return whether the directory contains the national park
     */
    Boolean contains(NationalPark park);

    /**
     * @param park national park to add
     */
    void addNationalPark(NationalPark park);

    /**
     * @param park national park to remove
     * @throws NationalParkNotFoundException if the national park is not found in the directory
     */
    void removeNationalPark(NationalPark park) throws NationalParkNotFoundException;

    /**
     * @param state state to search for
     * @return    array of national parks in the state
     */
    NationalPark[] findParksWithinTheState(String state);

    /**
     * @param nationalParkID unique ID of the national park
     * @return national park with the given ID
     * @throws InvalidNationalParkIDException if the national park ID is not found in the directory
     */
    NationalPark getParkByID(String nationalParkID) throws InvalidNationalParkIDException;

}
