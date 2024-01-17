package observer;

import java.util.ArrayList;

public class Cartel implements Observer{
    private Subject cook;
    private ArrayList<Sighting> sightings;

    public Cartel(Subject cook) {
        this.cook = cook;
        this.sightings = new ArrayList<>();
        cook.registerObserver(this);
    }

    @Override
    public void update(String location, String description, ArrayList<String> accomplices) {
        Sighting newSighting = new Sighting(location, description, accomplices);
        sightings.add(newSighting);
    }

    @Override
    public String getLog() {
        return "h";
    }
}
