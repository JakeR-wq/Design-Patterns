package iterator;

public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    public TaskList(String name) {
        this.tickets = new Ticket[100];
        this.count = 0;
        this.name = name;
    }

    public void addTicket(String name, String teamMember, int difficulty) {
        this.tickets[count] = new Ticket(name, teamMember, difficulty);
        count++;
    }

    public void addTicket(Ticket ticket) {
        this.tickets[count] = ticket;
        count++;
    }

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

    public TaskListIterator createIterator() {
        return new TaskListIterator(tickets);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":\n");
        for (int i = 0; i < count; i++) {
            sb.append(tickets[i]).append("\n");
        }
        return sb.toString();
    }
}
