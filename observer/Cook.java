package observer;

import java.util.ArrayList;

/**
 * The Cook class is an implementation of the Subject interface and is responsible for registering,
 * removing, and notifying observers of sightings.
 */
public class Cook implements Subject{
    // declaring two private instance variables: `observers` and `name`.
    private ArrayList<Observer> observers;
    private String name;

    public Cook(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String location, String description, ArrayList<String> accomplices){
        for(Observer observer : observers) {
            observer.update(location, description, accomplices);
        }
    }

    public void enterSighting(String location, String description, String accomplices) {
        String[] accompliceArray = accomplices.split(", ");
        String firstAccomString = accompliceArray[0];
        ArrayList<String> accomplicesList = new ArrayList<>();
        accomplicesList.add(firstAccomString);
        if (accompliceArray.length == 2) {
            String secondAccomString = accompliceArray[1];
            accomplicesList.add(secondAccomString);
        }
        notifyObservers(location, description, accomplicesList);
    }

    public String getName(){
        return this.name;
    }

}
