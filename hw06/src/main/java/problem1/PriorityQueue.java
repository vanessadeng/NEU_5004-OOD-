package problem1;

public interface PriorityQueue {

    PriorityQueue createEmpty(){
        return new EmptyPriorityQueue();
    }

    Boolean isEmpty();


    PriorityQueue add(Integer priority, String value);

    String peek();

    PriorityQueue pop();
}
