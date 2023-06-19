package problem2;

/**
 * Class Set represents a set of integers
 */
public class Set implements SetInterface{

    private Integer[] elements;
    private int size;

    /**
     * @param elements array of elements
     * @param size number of elements in the array
     */
    public Set(Integer[] elements, int size) {
        this.elements = new Integer[100];
        this.size = 0;
    }


    /**
     * @return new empty set
     */
    public Set emptySet() {
        return new Set(new Integer[100], 0);
    }


    /**
     * @return true if the set is empty, false otherwise
     */
    @Override
    public Boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * @param n integer to add to the set
     * @return set with n added
     */
    @Override
    public Set add(Integer n) {
        if (!this.contains(n)) {
            if (this.size >= this.elements.length) {
                Integer[] newElements = new Integer[this.size * 2];
                for (int i = 0; i < this.size; i++) {
                    newElements[i] = this.elements[i];
                }

            }
            this.elements[this.size] = n;
            this.size++;
        }
        return this;
    }

    /**
     * @param n integer to check
     * @return true if the set contains n, false otherwise
     */
    @Override
    public Boolean contains(Integer n) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(n)) return true;
        }
        return false;
    }

    /**
     * @param n integer to remove
     * @return set with n removed
     */
    @Override
    public Set remove(Integer n) {
        if (this.contains(n)) {
            Integer[] newElements = new Integer[this.size - 1];
            boolean removed = false;
            int i = 0;
            while (i < this.size - 1) {
                if (removed == false && this.elements[i].equals(n)) {
                    removed = true;
                    i -= 1;
                } else if (removed == false && !this.elements[i].equals(n)) {
                    newElements[i] = this.elements[i];
                } else {
                    newElements[i] = this.elements[i + 1];
                }
                i++;
            }
            this.elements = newElements;
            this.size--;
        }
        return this;
    }

    /**
     * @return number of elements in the set
     */
    @Override
    public Integer size() {
        return this.size;
    }
}
