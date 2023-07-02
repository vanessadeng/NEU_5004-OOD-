package problem2;

import java.util.Objects;

/**
 * Represent a non-empty bag of words
 */
public class NonEmptyBagOfWords implements BagOfWords{

    private String word;
    private BagOfWords bagOfWords;

    /**
     * @param word the word
     * @param bagOfWords the rest of the bag of words
     */
    public NonEmptyBagOfWords(String word, BagOfWords bagOfWords) {
        this.word = word;
        this.bagOfWords = bagOfWords;
    }

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
        return false;
    }

    /**
     * @return the number of words in the bag of words
     */
    @Override
    public Integer size() {
        return 1 + this.bagOfWords.size();
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
        if (this.word.equals(s)) {
            return true;
        } else {
            return this.bagOfWords.contains(s);
        }
    }

    /**
     * @param o the object to compare
     * @return true if the given object is a non-empty bag of words with the same word and bag of words, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonEmptyBagOfWords that = (NonEmptyBagOfWords) o;
        return Objects.equals(word, that.word) && Objects.equals(bagOfWords, that.bagOfWords);
    }

    /**
     * @return the hashcode of this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(word, bagOfWords);
    }

    /**
     * @return the string representation of this object
     */
    @Override
    public String toString() {
        return "NonEmptyBagOfWords{" +
                "word='" + word + '\'' +
                ", bagOfWords=" + bagOfWords +
                '}';
    }
}

