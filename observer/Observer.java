package observer;

import java.util.ArrayList;

// The code is defining an interface called `Observer`.
public interface Observer {
    /**
     * The function "update" takes in a location, description, and a list of accomplices as parameters.
     * 
     * @param location A string representing the location where the update is taking place.
     * @param description The description parameter is a String that represents the updated description
     * of the location.
     * @param accomplices The "accomplices" parameter is an ArrayList of Strings that represents a list
     * of people who are involved or associated with the update.
     */
    public void update(String location, String description, ArrayList<String> accomplices);

    /**
     * The function "getLog" returns a string.
     * 
     * @return The method is returning a String.
     */
    public String getLog();
}
