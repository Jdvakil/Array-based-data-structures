import java.util.Arrays;

/**
 * This class is designed to represent a Stack using the form LIFO, last in
 * first out.
 * @author Jay Darshan Vakil
 * @version 01/28/2020
 */
public class Stack {
    private Object[] StackList;
    private int numOfElements;// number of elements

    /**
     * This is the first, no argument constructor. it takes in no argument and sets
     * the initial stack with a length of 1 and the number of elements to 0.
     */
    public Stack() {
        this.StackList = new Object[1];
        this.numOfElements = 0;
    }

    /**
     * This is the second and full constructor, it takes in an arguement, an array
     * full of Objects.
     * 
     * @param array
     */
    public Stack(Object[] array) {
        this.StackList = new Object[array.length];
        this.numOfElements = 0;
        System.arraycopy(array, 0, this.StackList, 0, this.numOfElements);
    }

    /**
     * This method returns the size of the stack.
     * 
     * @return the size of the stack
     */
    public int size() {
        return this.StackList.length;
    }

    /**
     * This method adds/pushes a new object to the stack.
     * 
     * @param obj the object to be pushed to the stack
     */
    public void push(Object obj) {
        if (this.numOfElements == this.size()) {
            this.StackList = Arrays.copyOf(this.StackList, this.size() + 1);
        }
        this.StackList[this.numOfElements++] = obj;
    }

    /**
     * This method gets the object at the given index
     * 
     * @param index the index of the object
     * @return the object at the index PRECONDITIONS: The user will enter an index
     *         in the range of the stack POSTCONDITIONS: The method will return the
     *         object at the index
     */
    public Object get(int index) {
        return this.StackList[index];
    }

    /**
     * 
     * This method pops/removes the object that was inserted the last in the stack.
     * 
     * @return the object that was popped.
     */
    public Object pop() {
        Object obj = this.StackList[this.size() - 1];
        this.StackList = Arrays.copyOf(this.StackList, this.size() - 1);
        return obj;
    }

    /**
     * This method checks if the stack is empty or not
     * 
     * @return true or false
     */
    public boolean isEmpty() {
        boolean isEmpty = true;// assumes the stack is empty
        if (this.size()-1 == 0) {
            isEmpty = true;
        } else {
            isEmpty = false;
        }
        return isEmpty;
    }

    /**
     * This method checks if two stacks are equal or not.
     * 
     * @param otherStack
     * @return 
     *PRECONDITIONS: The user will enter a valid stack with valid elements
     *POSTCONDITIONS: The method will successfully check if two stacks are equal or not
     */
    public boolean equals(Stack otherStack) {
        boolean equals = false;
        if (this.size() == otherStack.size()) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i) == otherStack.get(i)) {
                    equals = true;
                } else {
                    equals = false;
                }
            }
        } else {
            equals = false;
        }
        return equals;
    }

    /**
     * This method outputs the whole class into an output string.
     */
    @Override
    public String toString() {
        String res = "[ ";
        for (int i = 0; i < this.size(); i++) {
            if (this.StackList[i] != null) {
                res += StackList[i] + " ";
            }
        }
        res += "]";
        return res;
    }

}