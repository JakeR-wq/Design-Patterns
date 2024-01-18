package observer;

import java.util.ArrayList;

/**
 * The Police class is an implementation of the Observer interface that keeps track of locations,
 * notes, and people related to a subject.
 */
public class Police implements Observer{
    // These are instance variables of the Police class.
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    /**
    * Constructs a new Police object.
    *
    * @param cook The Subject (Cook) to observe for sightings.
    */
    public Police(Subject cook) {
        this.cook = cook;
        this.locations = new ArrayList<>();
        this.people = new ArrayList<>();
        cook.registerObserver(this);
    }

    /**
     * The update function adds a location, updates the notes with a description, and adds any new
     * accomplices to the list of people.
     * 
     * @param location The location parameter represents the location where the update is being made.
     * It could be a specific place or an address.
     * @param description The "description" parameter is a string that represents additional
     * information or details about the update. It could include any relevant information related to
     * the update, such as new findings, progress made, or any other relevant details.
     * @param accomplices An ArrayList of Strings containing the names of the accomplices involved in
     * the update.
     */
    @Override
    public void update(String location, String description, ArrayList<String> accomplices) {
        // adding location
        this.locations.add(location);

        // updating notes with description
        String oldDes = this.notes;
        if (oldDes == null) {
            this.notes = description + "\n";
        } else {
            this.notes = oldDes + description + "\n";
        }

        // adding accomplices, not adding the duplicates
        for (String accomplice : accomplices) {
            if (!people.contains(accomplice)) {
                people.add(accomplice);
            }
        }
    }

    
    /**
     * The `getLog()` function returns a formatted log containing information about locations, notes,
     * and accomplices.
     * 
     * @return The method is returning a string representation of a log.
     * 
     * Formatting help: ChatGPT
     */
    @Override
    public String getLog() {
        StringBuilder logBuilder = new StringBuilder();

        // Locations section
        logBuilder.append("Locations:\n");
        for (String location : this.locations) {
            logBuilder.append("- ").append(location).append("\n");
        }

        // Notes section
        logBuilder.append("\nNotes:\n");
        String[] notesArray = this.notes.split("\n");
        for (String note : notesArray) {
            logBuilder.append("- ").append(note.trim()).append("\n");
        }

        // Accomplices section
        logBuilder.append("\nAccomplices:\n");
        for (String accomplice : this.people) {
            logBuilder.append("- ").append(accomplice).append("\n");
        }
    return logBuilder.toString();
    }
}
