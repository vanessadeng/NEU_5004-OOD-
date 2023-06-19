package problem2;

import java.util.Objects;


/**
 * Represents a locker with its details--maxWidth, maxHeight, maxDepth, itemInLocker
 * A locker can be empty or occupied by a mail item
 */
public class Locker {

    protected int maxWidth;
    protected int maxHeight;
    protected int maxDepth;
    protected MailItem itemInLocker;


    /**
     * @param maxWidth maximum width of the locker
     * @param maxHeight maximum height of the locker
     * @param maxDepth maximum depth of the locker
     * @throws IllegalDimensionException when the input dimension is invalid
     */
    public Locker(int maxWidth, int maxHeight, int maxDepth) throws IllegalDimensionException {
        if (maxWidth >= 10) {
            this.maxWidth = maxWidth;
        } else {
            throw new IllegalDimensionException("Invalid input!");
        }

        if (maxHeight >= 20) {
            this.maxHeight = maxHeight;
        } else {
            throw new IllegalDimensionException("Invalid input!");
        }

        if (maxDepth >= 15) {
            this.maxDepth = maxDepth;
        } else {
            throw new IllegalDimensionException("Invalid input!");
        }
        this.itemInLocker = null;
    }


    /**
     * @return the maximum width of the locker
     */
    public int getMaxWidth() {
        return maxWidth;
    }


    /**
     * @param maxWidth the maximum width of the locker
     * @throws IllegalDimensionException when the input dimension is invalid
     */
    public void setMaxWidth(int maxWidth) throws IllegalDimensionException {
        if (maxWidth >= 10) {
            this.maxWidth = maxWidth;
        } else {
            throw new IllegalDimensionException("Invalid input!");
        }
    }


    /**
     * @return the maximum height of the locker
     */
    public int getMaxHeight() {
        return maxHeight;
    }

    /**
     * @param maxHeight the maximum height of the locker
     * @throws IllegalDimensionException when the input dimension is invalid
     */
    public void setMaxHeight(int maxHeight) throws IllegalDimensionException {
        if (maxHeight >= 20) {
            this.maxHeight = maxHeight;
        } else {
            throw new IllegalDimensionException("Invalid input!");
        }
    }


    /**
     * @return the maximum depth of the locker
     */
    public int getMaxDepth() {
        return maxDepth;
    }


    /**
     * @param maxDepth the maximum depth of the locker
     * @throws IllegalDimensionException when the input dimension is invalid
     */
    public void setMaxDepth(int maxDepth) throws IllegalDimensionException {
        if (maxDepth >= 15) {
            this.maxDepth = maxDepth;
        } else {
            throw new IllegalDimensionException("Invalid input!");
        }
    }


    /**
     * @return the mail item in the locker
     */
    public MailItem getItemInLocker() {
        return itemInLocker;
    }


    /**
     * @param itemInLocker the mail item in the locker
     */
    public void setItemInLocker(MailItem itemInLocker) {
        this.itemInLocker = itemInLocker;
    }


    /**
     * @param mailItem the mail item to be added to the locker
     * @throws exceedDimensionException when the mail item exceeds the dimension of the locker
     * @throws lockerOccupiedException when the locker is occupied
     */
    public void addMail(MailItem mailItem) throws exceedDimensionException, lockerOccupiedException {
        if (getItemInLocker() == null && mailItem.width <= maxWidth && mailItem.height <= maxHeight
                && mailItem.depth <= maxDepth) {
            setItemInLocker(mailItem);
        } else if (getItemInLocker() != null) {
            throw new lockerOccupiedException("The locker is occupied!");
        } else {
            throw new exceedDimensionException("Unable to put it in!");
        }
    }

    /**
     * @param recipient the recipient who wants to pick up the mail
     * @return the mail item picked up by the recipient
     * @throws IllegalPickUpException when the recipient is not able to pick up the mail
     */
    public MailItem pickupMail(Recipient recipient) throws IllegalPickUpException {
        if (getItemInLocker() != null && getItemInLocker().currentRecipient.equals(recipient)) {
            MailItem mailToPickup = getItemInLocker();
            setItemInLocker(null);
            return mailToPickup;
        } else {
            throw new IllegalPickUpException("Not able to pick up!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Locker locker = (Locker) o;
        return maxWidth == locker.maxWidth && maxHeight == locker.maxHeight
                && maxDepth == locker.maxDepth
                && Objects.equals(itemInLocker, locker.itemInLocker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxWidth, maxHeight, maxDepth, itemInLocker);
    }

    @Override
    public String toString() {
        return "Locker{" +
                "maxWidth=" + maxWidth +
                ", maxHeight=" + maxHeight +
                ", maxDepth=" + maxDepth +
                ", itemInLocker=" + itemInLocker +
                '}';
    }
}