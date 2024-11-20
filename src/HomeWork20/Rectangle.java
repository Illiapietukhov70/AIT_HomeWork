package HomeWork20;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(String name, double height, double width) {
        super(name);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }

    @Override
    public String displayInfo() {
        return name;
    }

    @Override
    public double calculateArea() {
        return height * width;
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

    private void setDimensions(double height, double width){
        this.height = height;
        this.width = width;
    }
}
