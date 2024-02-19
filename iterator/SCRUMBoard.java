package iterator;

/**
 * Represents a SCRUM board for managing tasks in a project.
 * @author jacob robertson
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    /**
     * Constructs a new SCRUMBoard with the given project name.
     * @param projectName the name of the project associated with this SCRUM board
     */
    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        this.todo = new TaskList("ToDo");
        this.doing = new TaskList("Doing");
        this.done = new TaskList("Done");
    }

    /**
     * Adds a new ticket to the "ToDo" list.
     * @param name the name of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficulty level of the ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        todo.addTicket(new Ticket(name, teamMember, difficulty));
    }

    /**
     * Moves a ticket from the "ToDo" list to the "Doing" list.
     * @param name the name of the ticket to start
     * @return true if the ticket was successfully started, false otherwise
     */
    public boolean startTicket(String name) {
        Ticket ticket = todo.getTicket(name);
        if (ticket != null) {
            doing.addTicket(ticket);
            return true;
        }
        return false;
    }

    /**
     * Moves a ticket from the "Doing" list to the "Done" list.
     * @param name the name of the ticket to finish
     * @return true if the ticket was successfully finished, false otherwise
     */
    public boolean finishTicket(String name) {
        Ticket ticket = doing.getTicket(name);
        if (ticket != null) {
            done.addTicket(ticket);
            return true;
        }
        return false;
    }

    /**
     * Returns a string representation of the SCRUM board, including all task lists.
     * @return a string representation of the SCRUM board
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("***** ").append(projectName).append(" *****\n");
        sb.append(todo).append("\n");
        sb.append(doing).append("\n");
        sb.append(done);
        return sb.toString();
    }
}
