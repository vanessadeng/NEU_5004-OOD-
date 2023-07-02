package problem2;

/**
 * Represent an empty bag of words
 */
public class EmptyBagOfWords implements BagOfWords{
    /**
     * @return an empty bag of words
     */
    @Override
    public BagOfWords emptyBagOfWords() {
        return new EmptyBagOfWords();
    }

    /**
     * @return true if the bag of words is empty, false otherwise
     */
    @Override
    public Boolean isEmpty() {
        return true;
    }

    /**
     * @return the number of words in the bag of words
     */
    @Override
    public Integer size() {
        return 0;
    }

    /**
     * @param s the word to add to the bag of words
     * @return a new bag of words with the given word added
     */
    @Override
    public BagOfWords add(String s) {
        return new NonEmptyBagOfWords(s, this);
    }

    /**
     * @param s the word to check for
     * @return true if the bag of words contains the given word, false otherwise
     */
    @Override
    public Boolean contains(String s) {
        return false;
    }

    /**
     * @param obj the object to compare
     * @return true if the given object is an empty bag of words, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return obj instanceof EmptyBagOfWords;
    }

    /**
     * @return the hashcode of an empty bag of words
     */
    @Override
    public int hashCode() {
        return 0;
    }

    /**
     * @return the string representation of an empty bag of words
     */
    @Override
    public String toString() {
        return "EmptyBagOfWords{}";
    }

}
