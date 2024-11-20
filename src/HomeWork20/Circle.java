package HomeWork20;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String displayInfo() {
        return name;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void setColor(String color) {
        this.color = color;

    }

    @Override
    public String toString() {
        String result = String.format("Name: %s Perimeter: %.2f Area: %.2f Color: %s", displayInfo(), getPerimeter(), calculateArea(), color);
        return result;
    }

    private void setDimensions(double radius) {
        this.radius = radius;
    }
}
