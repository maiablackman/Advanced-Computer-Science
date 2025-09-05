// camelCase -> way to write variable names, standard
// first letter lowercase if variables and methods, otherwise keep capital for class names
    
public class Spaceship {

    // instance variables
    private String description;
    private int passengerCount;
    private double fuelLevel;
    private boolean shieldsActive;

    // constructors 
    public Spaceship(String inputDescription, int inputPassengerCount, double inputFuelLevel, boolean inputShieldsActive) {
        description = inputDescription;
        passengerCount = inputPassengerCount;
        fuelLevel = inputFuelLevel;
        shieldsActive = inputShieldsActive;
    }
        Spaceship ship = new Spaceship("red", 30, 90.0, true);
    // methods
        String shipDescritpion = ship.getDescription();

        int shipPassengerCount = ship.getPassengerCount();

        double shipFuelLevel = ship.getFuelLevel();

        boolean shipShieldsActive = ship.getShieldsActive();

   
    // getters (aka accesors)

    public String getDescription() {
        return description;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean getShieldsActive() {
        return shieldsActive;
    }



// setters (void methods)
public void setDescription(String input){
    description = input;

}

public void setPassengerCount(int input) {
    passengerCount = input;
}

public void setFuelLevel(double input) {
    fuelLevel = input;
}

public void setShieldsActive(boolean input) {
    shieldsActive = input;
}



}

// challenge: use 3 setters to update the values of 3 diff instance variables, print before and after update.

