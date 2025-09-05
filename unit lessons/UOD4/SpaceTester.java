public class SpaceTester {
    public static void main(String[] args) {
        // 1. Instantiate a spaceship object
        Spaceship ship = new Spaceship("red", 30, 90.0, true);
        // the new keyword creates a new object, instance of the class
        // 2. invoke method
        String shipDescritpion = ship.getDescription();

        int shipPassengerCount = ship.getPassengerCount();

        double shipFuelLevel = ship.getFuelLevel();

        boolean shipShieldsActive = ship.getShieldsActive();

        System.out.println(shipDescritpion);
        System.out.println(shipPassengerCount);
        System.out.println(shipFuelLevel);
        System.out.println(shipShieldsActive);
        // 3. manipulate the data
        ship.setDescription("stripes");
        ship.setPassengerCount(30);
        ship.setFuelLevel(20.0);
        ship.setShieldsActive(false);

        System.out.println(ship.getDescription());
        System.out.println(ship.getPassengerCount());
        System.out.println(ship.getFuelLevel());
        System.out.println(ship.getShieldsActive());
    }
    
}
