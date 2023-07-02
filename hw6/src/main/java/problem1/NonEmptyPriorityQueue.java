package problem1;

import java.util.Objects;

/**
 * NonEmptyPriorityQueue represents a non-empty priority queue
 */
public class NonEmptyPriorityQueue implements PriorityQueue{

    private Integer priority;
    private String value;
    private PriorityQueue nextPriorityQueue;

    /**
     * @param priority the priority of the element
     * @param value the value of the element
     * @param nextPriorityQueue the next priority queue
     */
    public NonEmptyPriorityQueue(Integer priority, String value, PriorityQueue nextPriorityQueue) {
        this.priority = priority;
        this.value = value;
        this.nextPriorityQueue = nextPriorityQueue;
    }

    /**
     * @return false since this is a non-empty priority queue
     */
    @Override
    public Boolean isEmpty() {
        return false;
    }

    /**
     * @param element the priority of the element
     * @param value the value of the element
     * @return a new NonEmptyPriorityQueue with the given element and value
     */
    @Override
    public PriorityQueue add(Integer element, String value) {
        if (element < this.priority) {
            return new NonEmptyPriorityQueue(element, value, this);
        } else {
            return new NonEmptyPriorityQueue(this.priority, this.value, this.nextPriorityQueue.add(element, value));
        }
    }

    /**
     * @return the value of the element with the highest priority
     */
    @Override
    public String peek() {
        if (this.nextPriorityQueue.isEmpty()) {
            return this.value;
        } else {
            return this.nextPriorityQueue.peek();
        }
    }

    /**
     * @return a new priority queue without the element with the highest priority
     */
    @Override
    public PriorityQueue pop() {
        if (this.nextPriorityQueue.isEmpty()) {
            return new EmptyPriorityQueue();
        } else {
            return new NonEmptyPriorityQueue(this.priority, this.value, this.nextPriorityQueue.pop());
        }
    }

    /**
     * @param o the object to be compared
     * @return true if the given object is a NonEmptyPriorityQueue and has the same priority, value and nextPriorityQueue as this NonEmptyPriorityQueue
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonEmptyPriorityQueue that = (NonEmptyPriorityQueue) o;
        return Objects.equals(priority, that.priority) && Objects.equals(value, that.value) && Objects.equals(nextPriorityQueue, that.nextPriorityQueue);
    }

    /**
     * @return the hashcode of this NonEmptyPriorityQueue
     */
    @Override
    public int hashCode() {
        return Objects.hash(priority, value, nextPriorityQueue);
    }
}
