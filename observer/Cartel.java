package observer;

import java.util.ArrayList;

/**
 * Represents a Cartel that observes sightings and maintains a log of a cook.
 */
public class Cartel implements Observer{
    private Subject cook;
    private ArrayList<Sighting> sightings;

    /**
     * Constructs a new Cartel object.
     *
     * @param cook The Subject (Cook) to observe for sightings.
     */
    public Cartel(Subject cook) {
        this.cook = cook;
        this.sightings = new ArrayList<>();
        cook.registerObserver(this);
    }

    /**
     * Updates the Cartel with information about a new sighting.
     *
     * @param location     The location of the sighting.
     * @param description  Details about the sighting.
     * @param accomplices  List of accomplices associated with the sighting.
     */
    @Override
    public void update(String location, String description, ArrayList<String> accomplices) {
        Sighting newSighting = new Sighting(location, description, accomplices);
        sightings.add(newSighting);
    }

    /**
     * Retrieves a formatted log containing information about observed sightings.
     *
     * @return A formatted log string with locations, details, and accomplices of observed sightings.
     */
    @Override
    public String getLog() {
        StringBuilder logBuilder = new StringBuilder();
        for (Sighting sighting : sightings) {
            logBuilder.append(sighting.getLocation())
                .append(" (").append(sighting.getDetails()).append("), with ")
                .append(String.join(", ", sighting.getAccomplices()))
                .append("\n");
        }
        return logBuilder.toString();
    }
}
