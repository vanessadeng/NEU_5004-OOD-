package problem2;

/**
 * BagOfWords represents a bag of words
 */
public interface BagOfWords {

    /**
     * @return an empty bag of words
     */
    BagOfWords emptyBagOfWords();

    /**
     * @return true if the bag of words is empty, false otherwise
     */
    Boolean isEmpty();

    /**
     * @return the number of words in the bag of words
     */
    Integer size();

    /**
     * @param s the word to add
     * @return a new bag of words with the given word added
     */
    BagOfWords add(String s);

    /**
     * @param s the word to check
     * @return true if the bag of words contains the given word, false otherwise
     */
    Boolean contains(String s);


}
