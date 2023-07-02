package problem1;

/**
 * Represent a priority queue
 */
public interface PriorityQueue {

    /**
     * @return an empty priority queue
     */
    static PriorityQueue createEmpty(){
        return new EmptyPriorityQueue();
    }


    /**
     * @return true if the priority queue is empty, false otherwise
     */
    Boolean isEmpty();

    /**
     * @param element the priority of the element
     * @param value the value of the element
     * @return a new priority queue with the given element and value
     */
    PriorityQueue add(Integer element, String value);

    /**
     * @return the value of the element with the highest priority
     */
    String peek();

    /**
     * @return a new priority queue without the element with the highest priority
     */
    PriorityQueue pop();

}
