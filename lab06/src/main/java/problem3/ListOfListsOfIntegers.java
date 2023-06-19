package problem3;

import problem1.ListOfIntegers;

public interface ListOfListsOfIntegers {


    /**
     * @return the number of list of integers inside the outside list
     */
    Integer size();

    /**
     * @return the number of integers inside the list
     */
    Integer length();

    /**
     * @return the sum of all the integers inside the list
     */
    Integer sum();

    Boolean isEmpty();



    ListOfListsOfIntegers add(ListOfIntegers list);

    /**
     * takes an integer and removes the first occurance of this integer from the list
     * @param element
     * @return
     */
    ListOfListsOfIntegers removeInteger(Integer element);

    /**
     * takes an integer and remove all occurances of it from the list
     * @param element
     * @return
     */
    ListOfListsOfIntegers removeAllIntegers(Integer element);

}

