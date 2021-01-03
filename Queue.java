import java.util.Arrays;

/**
 * This class represents a queue, using the method FIFO, first in first out.
 * @author Jay Darshan Vakil
 * @version 01/28/2020
 */
public class Queue {
    private Object[] QueueList;// the initial array
    private int numOfElements;// the number of elements.

    /**
     * This is the first constructor that initiates the original array for one size
     * and then it increases further.
     */
    public Queue() {
        this.QueueList = new Object[1];
        this.numOfElements = 0;
    }

    /**
     * This is the second constructor for the class, it takes in an arguement, an
     * array full of Objects.
     * 
     * @param queue
     */
    public Queue(Object[] queue) {
        this.QueueList = new Object[queue.length];
        this.QueueList = Arrays.copyOf(queue, queue.length);
        this.numOfElements = 0;
    }

    /**
     * This method returns the size of the queue.
     * 
     * @return the size of the array
     */
    public int size() {
        return this.QueueList.length;
    }

    /**
     * This method adds elements in FIFO form, it adds first to last.
     * 
     * @param obj element to be added
     */
    public void enqueue(Object obj) {
        // This if statement was helped by a friend. The algorithm is not mine.
        if (this.numOfElements == this.size()) {
            this.QueueList = Arrays.copyOf(this.QueueList, this.size() + 1);
        }
        this.QueueList[this.numOfElements++] = obj;
    }

    /**
     * This method removes elements in FIFO form, so the first element to be added
     * would be removed first
     * 
     * @return the item dequeued.
     */
    public Object dequeue() {
        Object item = this.QueueList[0];
        this.QueueList[0] = null;//to remove the first element
        System.arraycopy(this.QueueList, 1, this.QueueList, 0, this.numOfElements - 1);
        this.numOfElements--;
        return item;
    }

    /**
     * This method checks if the queue is empty or not
     * 
     * @return
     */
    public boolean isEmpty() {
        boolean res = false;
        if (this.numOfElements == 0) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    /**
     * This method gets the object from the queue at the given index
     * 
     * @param index
     * @return PRECONDITIONS: The user will give an index that is in the range of
     *         the queue POSTCONDITIONS: The method will return the Object at the
     *         given index
     */
    public Object get(int index) {
        return this.QueueList[index];
    }

    /**
     * This method compares between two Queues and returns if they are equal or not.
     * 
     * @param otherQueue The other queue object
     * @return true or false PRECONDITION: The user passes a valid queue
     *         POSTCONDITION: The method successfully compares two queues
     */
    public boolean equals(Queue otherQueue) {
        boolean res = false;
        if (this.size() == otherQueue.size()) {
            for (int i = 0; i < this.size(); i++) {
                if (this.QueueList[i] == otherQueue.get(i)) {
                    res = true;
                } else {
                    res = false;
                }
            }
        } else {
            res = false;
        }
        return res;
    }

    /**
     * This method outputs the class into a String form so the class(queue) can be
     * printed out.
     */
    @Override
    public String toString() {
        String res = "[ ";
        for (int i = 0; i < numOfElements; i++) {
            res += QueueList[i] + " ";
        }
        res += "]";
        return res;
    }
}