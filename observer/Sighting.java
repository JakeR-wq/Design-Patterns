package observer;

import java.util.ArrayList;

/**
 * Represents a sighting with information about its location, details, and accomplices.
 */
public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices;

    /**
     * Constructs a new Sighting with the specified location, details, and accomplices.
     *
     * @param location    The location where the sighting occurred.
     * @param details     Details about the sighting.
     * @param accomplices List of accomplices associated with the sighting.
     */
    public Sighting(String location, String details, ArrayList<String> accomplices) {
        this.location = location;
        this.details = details;
        this.accomplices = new ArrayList<>(accomplices);
    }

    /**
     * Gets the location of the sighting.
     *
     * @return The location where the sighting occurred.
    */
    public String getLocation() {
        return location;
    }

    /**
     * Gets details about the sighting.
     *
     * @return Details about the sighting.
    */
    public String getDetails() {
        return details;
    }

    /**
     * Gets a copy of the list of accomplices associated with the sighting.
     *
     * @return List of accomplices associated with the sighting.
     */
    public ArrayList<String> getAccomplices() {
        return new ArrayList<>(accomplices); // returns a copy
    }
}
