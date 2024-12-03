package HomeWork20;

public class Triangle extends Shape {
    private double a;
    private double b;
    private  double c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        if(a < (c + b) && b < (a + c) && c < (a + b)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new MyException("Условие сторон треугольника не выполняется");
        }



    }


    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String displayInfo() {
        return name;
    }

    @Override
    public double calculateArea() {
        double tempHalfPer = getPerimeter()/ 2;
        return Math.pow((tempHalfPer - a) * (tempHalfPer - b) * (tempHalfPer - c) * tempHalfPer, 0.5);
    }

    @Override
    public void setColor(String color) {

    }

    @Override
    public String toString() {
        String result = String.format("Name: %s Perimeter: %.2f Area: %.2f Color: %s", displayInfo(), getPerimeter(), calculateArea(), color);
        return result;
    }
}
