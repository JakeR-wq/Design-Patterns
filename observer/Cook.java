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

    /**
     * Constructs a new Cook object with the specified name.
     *
     * @param name The name of the Cook.
     */
    public Cook(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * The function adds an observer to a list of observers.
     * 
     * @param observer The "observer" parameter is an object that implements the Observer interface.
     * This object will be added to a list of observers, so that it can be notified of any changes or
     * updates.
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * The removeObserver function removes an observer from a list of observers.
     * 
     * @param observer The parameter "observer" is an object of the Observer class that we want to
     * remove from the list of observers.
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * The function notifies all observers with the given location, description, and accomplices.
     * 
     * @param location A string representing the location where the event occurred or is happening.
     * @param description The "description" parameter is a string that represents the description of
     * the event or situation being observed.
     * @param accomplices The "accomplices" parameter is an ArrayList of Strings that represents a list
     * of people or entities who are involved or associated with the location and description being
     * notified to the observers.
     */
    @Override
    public void notifyObservers(String location, String description, ArrayList<String> accomplices){
        for(Observer observer : observers) {
            observer.update(location, description, accomplices);
        }
    }

    /**
     * The function "enterSighting" takes in a location, description, and a string of accomplices,
     * splits the accomplices into an array, adds the first two accomplices to an ArrayList, and then
     * notifies observers with the location, description, and accomplices.
     * 
     * @param location The location where the sighting occurred.
     * @param description The description parameter is a String that represents the description of the
     * sighting. It provides additional details or information about the sighting.
     * @param accomplices The "accomplices" parameter is a string that contains the names of the
     * accomplices separated by commas and spaces.
     */
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

    /**
     * The getName() function returns the name of an object.
     * 
     * @return The method is returning the value of the variable "name".
     */
    public String getName(){
        return this.name;
    }

}
