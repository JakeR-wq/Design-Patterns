package observer;

import java.util.ArrayList;

/**
 * subject interface, provides function prototypes to 
 * be implemented in implemented child classes
 */
public interface Subject {

    /**
     * The function "registerObserver" is used to add an observer to a list of observers.
     * 
     * @param observer The observer parameter is an object that implements the Observer interface. This
     * object will be notified whenever there is a change in the state of the subject being observed.
     */
    public void registerObserver(Observer observer);

    /**
     * The removeObserver function is used to remove an observer from a list of observers.
     * 
     * @param observer The observer parameter is an object that implements the Observer interface. This
     * object is the observer that you want to remove from the list of observers.
     */
    public void removeObserver(Observer observer);

    /**
     * This function notifies observers with the location, description, and list of accomplices.
     * 
     * @param location A string representing the location where the event or observation occurred.
     * @param description The description parameter is a string that represents the description of the
     * event or situation that is being observed.
     * @param accomplices An ArrayList of Strings that contains the names of the accomplices involved
     * in the event being notified.
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices);
}
