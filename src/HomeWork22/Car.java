package HomeWork22;

public class Car extends Vehicle{
    private String typeEngine;
    private String name;

    public Car(String typeEngine, String name) {
        this.typeEngine = typeEngine;
        this.name = name;
    }

    @Override
    protected void startEngine() {
        System.out.printf("Car %s with %s engine is starting\n", name, typeEngine);
    }
}
