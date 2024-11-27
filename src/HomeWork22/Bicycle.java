package HomeWork22;

public class Bicycle extends Vehicle{
    private String name;
    public Bicycle(String name) {
        this.name = name;
    }

    @Override
    protected void startEngine() {
        System.out.printf("Bicycle %s say - work your legs!!!\n", name);
    }
}
