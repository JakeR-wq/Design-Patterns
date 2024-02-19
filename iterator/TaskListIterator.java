package iterator;

import java.util.Iterator;

/**
 * An iterator for iterating over tickets in a TaskList.
 * @author jacob robertson
 */
public class TaskListIterator implements Iterator{
    private Ticket[] tickets;
    private int position;

    /**
     * Constructs a new TaskListIterator with the given array of tickets.
     * @param tickets the array of tickets to iterate over
     */
    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        this.position = 0;
    }

    /**
     * Returns true if there are more tickets to iterate over, false otherwise.
     * @return true if there are more tickets, false otherwise
     */
    @Override
    public boolean hasNext() {
        return position < tickets.length && tickets[position] != null;
    }
    /**
     * Returns the next ticket in the iteration.
     * @return the next ticket
     */
    @Override
    public Ticket next() {
        if(!hasNext())
            return null;
        return tickets[position++];
    }
}
