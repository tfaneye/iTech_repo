package collections.concepts.hashtables;

import java.util.Hashtable;

/**
 * Created by Tunde on 09/01/2017.
 */
public class Library {

    Hashtable<String, String> vehicles;

    public Library(){

        vehicles = new Hashtable<String, String>();
        vehicles.put("Tunde", "Bentley");
        vehicles.put("John", "BMW 5");
        vehicles.put("Dan", "Honda");
        vehicles.put("Ryan", "Benz G class");
    }

    public String getCar(String key) {
        return vehicles.get(key);
    }

    public String setCar(String carKey, String carName){
        return vehicles.put(carKey, carName);
    }

    public void clearCarRecord(){
        vehicles.clear();
    }
}
