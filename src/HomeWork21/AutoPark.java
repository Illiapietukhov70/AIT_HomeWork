package HomeWork21;

public class AutoPark {
    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John", "LN-45844564");

        Autobus bus = new Autobus(busDriver, 15);

        System.out.println(bus.toString());

        BusDriver peter = new BusDriver("Peter", "LN-12348789");

        bus.setDriver(peter);

        System.out.println(bus.toString());
        System.out.println(busDriver.toString());

        System.out.println("\n====================\n");

        BusDriver margo = new BusDriver("Margo", "AE-433453534");
        Autobus bus1 = new Autobus(margo, 24);

        System.out.println(bus1.toString());

        bus1.installNewAutopilot("AP-gpt6");
        System.out.println(bus1.toString());
        margo.setName("Margo-Susana");
        System.out.println(bus1.toString());

        bus1 = null;
        System.out.println(margo.toString());

        System.out.println(bus.toString());
        bus.setDriver(margo);
        System.out.println(bus.toString());

        System.out.println("\n=======================\n");

        Passenger passenger = new Passenger("Alex");
        Passenger passenger1 = new Passenger("Max");
        System.out.println(passenger.toString());
        System.out.println(passenger1.toString());

        bus.takePassenger(passenger);
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.takePassenger(passenger1);
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.takePassenger(passenger);
        System.out.println("count pass: " + bus.getCountPassengers());
        Passenger passenger3 = new Passenger("Boris");
        System.out.println(passenger3.toString());
        bus.takePassenger(passenger3);
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.dropPassenger(passenger3);
        System.out.println("count pass: " + bus.getCountPassengers());
        System.out.println(bus.getAllNamePass());


    }
}
