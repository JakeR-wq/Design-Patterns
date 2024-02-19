package iterator;

/**
 * Represents a list of tasks in a SCRUM board.
 * @author jacob robertson
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    /**
     * Constructs a new TaskList with the given name.
     * @param name the name of the task list
     */
    public TaskList(String name) {
        this.tickets = new Ticket[100];
        this.count = 0;
        this.name = name;
    }

    /**
     * Adds a new ticket to the task list.
     * @param name the name of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficulty level of the ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        this.tickets[count] = new Ticket(name, teamMember, difficulty);
        count++;
    }

    /**
     * Adds a ticket to the task list.
     * @param ticket the ticket to add
     */
    public void addTicket(Ticket ticket) {
        this.tickets[count] = ticket;
        count++;
    }

    /**
     * Retrieves and removes a ticket from the task list by its name.
     * @param name the name of the ticket to retrieve
     * @return the ticket if found, null otherwise
     */
    public Ticket getTicket(String name) {
        for (int i = 0; i < count; i++) {
            if (tickets[i].getName().toLowerCase().equals(name.toLowerCase())) {
                Ticket ticket = tickets[i];
                for (int j = i; j < count - 1; j++) {
                    tickets[j] = tickets[j + 1];
                }
                tickets[count - 1] = null;
                count--;
                return ticket;
            }
        }
        return null;
    }

    /**
     * Creates an iterator for iterating over the tickets in the task list.
     * @return a TaskListIterator instance
     */
    public TaskListIterator createIterator() {
        return new TaskListIterator(tickets);
    }

    /**
     * Returns a string representation of the task list.
     * @return a string representation of the task list
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":\n");
        for (int i = 0; i < count; i++) {
            sb.append(tickets[i]).append("\n");
        }
        return sb.toString();
    }
}
