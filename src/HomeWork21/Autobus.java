package HomeWork21;

import lesson_19.MyStrBuild;

public class Autobus {
    private static int counter;
    private final int id;
    private BusDriver driver;
    private Autopilot autopilot;
    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;

    public Autobus(BusDriver busDriver, int capacity) {
        this.id = counter++;
        this.driver = busDriver;
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v001");
        this.autopilot.setAutobus(this);
        this.passengers = new Passenger[capacity];
    }

    public boolean takePassenger(Passenger passenger) {
        if (countPassengers < capacity) {
            if (isPassengerInBus(passenger)) {
                System.out.printf("Пассажир id: %d уже в автобусе с id %d\n", passenger.getId(), this.id);
                return false;
            }
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир id: %d завершил посадку в автобус с id %d\n", passenger.getId(), this.id);
            return true;
        }
        System.out.printf("В автобусе id: %d свободных мест нет!\n", this.id);
        return false;
    }

    public boolean dropPassenger(Passenger passenger){
        if(isPassengerInBus(passenger)) {
            int tempId = -1;
            for (int i = 0; i < countPassengers; i++) {
                if (passengers[i].getId() == passenger.getId()) {
                    tempId = i;
                }
            }
            for(int j = tempId; j < countPassengers - 1;j++ ){
                passengers[j] = passengers[j+1];
            }
            countPassengers--;
            System.out.printf("Пассажир id: %d завершил высадку из автобуса с id %d\n", passenger.getId(), this.id);
            return true;
        }
        System.out.printf("Пассажир id: %d уже не в автобусе с id %d\n", passenger.getId(), this.id);
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }
        }
        return false;
    }

    public void updateAutopilotVersion(String softwareVersion) {
        this.autopilot.setSoftwareVersion(softwareVersion);
    }

    public void installNewAutopilot(String softwareVersion) {
        this.autopilot.setAutobus(null);
        this.autopilot = new Autopilot(softwareVersion);
        this.autopilot.setAutobus(this);
    }


    public String toString() {
        MyStrBuild msb = new MyStrBuild("Autobus: {id: " );
        msb.append(Integer.toString(id));
        msb.append("; capacity:");
        msb.append(capacity);
        msb.append("; driver: ");
        msb.append(driver.toString());
        msb.append("; autopilot: ");
        msb.append(autopilot.toString());
        return msb.toString();
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
    public String getAllNamePass() {
        MyStrBuild msb = new MyStrBuild("Список имен пассажиров aвтобуса с id ");
        msb.append(this.id);
        msb.append(" {");
        for(int i = 0; i < countPassengers; i++) {
            if(passengers[i].getName()!= null) {
                msb.append(passengers[i].getName());
                String str = (i == (countPassengers - 1))? "}\n":", ";
                msb.append(str);
            }
        }
        return msb.toString();
    }


}
