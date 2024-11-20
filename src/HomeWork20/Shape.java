package HomeWork20;

public abstract class Shape {
    protected String name;
    protected String color;

    public Shape(String name) {
        this.name = name;
        this.color = color;
    }
    public abstract double getPerimeter();
    public abstract String displayInfo();
    public abstract double calculateArea();
    public abstract void setColor(String color);
    public abstract String toString();
}
