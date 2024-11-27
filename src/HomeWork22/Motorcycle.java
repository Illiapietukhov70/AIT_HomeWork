package HomeWork22;

public class Motorcycle extends Bicycle {
    private String typeEngine;
    private String name;

    public Motorcycle(String name, String typeEngine) {
        super(name);
        this.name = name;
        this.typeEngine = typeEngine;
    }

    @Override
    protected void startEngine() {
        System.out.printf("Motorcycle %s with %s engine is starting\n", name, typeEngine);
    }
}
