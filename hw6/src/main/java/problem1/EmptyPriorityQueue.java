package problem1;

/**
 * EmptyPriorityQueue represents an empty priority queue
 * EmptyPriorityQueue is a PriorityQueue
 */
public class EmptyPriorityQueue implements PriorityQueue{
    /**
     * @return an empty priority queue
     * @spec.effects create an empty priority queue
     */
    @Override
    public Boolean isEmpty() {
        return true;
    }

    /**
     * @param element the priority of the element
     * @param value the value of the element
     * @return a new NonEmptyPriorityQueue with the given element and value
     */
    @Override
    public PriorityQueue add(Integer element, String value) {
        return new NonEmptyPriorityQueue(element, value, this);
    }

    /**
     * @return throw an exception
     * @throws IllegalQueueOperationException when calling peek on an empty priority queue
     */
    @Override
    public String peek() throws IllegalQueueOperationException {
        throw new IllegalQueueOperationException("Calling peek on an empty PQ");
    }

    /**
     * @return throw an exception
     * @throws IllegalQueueOperationException when calling pop on an empty priority queue
     */
    @Override
    public PriorityQueue pop() throws IllegalQueueOperationException{
        throw new IllegalQueueOperationException("Calling pop on an empty PQ");
    }



}
