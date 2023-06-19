package problem2;

import java.util.Objects;

/**
 * CS5004 Spring2022 Jin Young Park hw2 MailItem.java
 *
 * MailItem stores information of the mail. The information includes its width, height, depth, and
 * the recipient information of the mail.
 */
public class MailItem {

    protected int width;
    protected int height;
    protected int depth;
    protected Recipient currentRecipient;


    public MailItem(int width, int height, int depth, Recipient currentRecipient)
            throws IllegalDimensionException {
        if (width >= 1.5) {
            this.width = width;
        } else {
            throw new IllegalDimensionException("Invalid input!");
        }

        if (height >= 2) {
            this.height = height;
        } else {
            throw new IllegalDimensionException("Invalid input!");
        }

        if (depth >= 1) {
            this.depth = depth;
        } else {
            throw new IllegalDimensionException("Invalid input!");
        }
        this.currentRecipient = currentRecipient;
    }


    public int getWidth() {
        return width;
    }


    public void setWidth(int width) throws IllegalDimensionException {
        if (width >= 1.5) {
            this.width = width;
        } else {
            throw new IllegalDimensionException("Invalid input!");
        }
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int height) throws IllegalDimensionException {
        if (height >= 2) {
            this.height = height;
        } else {
            throw new IllegalDimensionException("Invalid input!");
        }
    }


    public int getDepth() {
        return depth;
    }


    public void setDepth(int depth) throws IllegalDimensionException{
        if (depth >= 1) {
            this.depth = depth;
        } else {
            throw new IllegalDimensionException("Invalid input!");
        }
    }


    public Recipient getCurrentRecipient() {
        return currentRecipient;
    }


    public void setCurrentRecipient(Recipient currentRecipient) {
        this.currentRecipient = currentRecipient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MailItem mailItem = (MailItem) o;
        return width == mailItem.width && height == mailItem.height && depth == mailItem.depth
                && Objects.equals(currentRecipient, mailItem.currentRecipient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, depth, currentRecipient);
    }

    @Override
    public String toString() {
        return "MailItem{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", currentRecipient=" + currentRecipient +
                '}';
    }
}