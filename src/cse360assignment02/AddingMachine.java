package cse360assignment02;

/**
 * <h1>Adding Machine</h1>
 * Adding Machine program adds and subtracts
 * a number from a running total.
 * Maintains a memory from the running
 * operations. Said memory can be cleared.
 *
 * @author      David Alejandro Umana Fleck
 * @version     1.0
 */
public class AddingMachine {
    private int total;


    /**
     * Initializes total to 0
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    /**
     * Get Total
     * @return value of Total
     */
    public int getTotal () {
        return 0;
    }

    /**
     * Adds value to the total
     * @param value
     */
    public void add (int value) {
    }

    /**
     * Subtracts value from the total
     * @param value
     */
    public void subtract (int value) {
    }

    /**
     * Prints history of operations
     * @return history of transactions
     */
    public String toString () {
        return "";
    }

    /**
     * Clears the memory
     */
    public void clear() {
    }
}

