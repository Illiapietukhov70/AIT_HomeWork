package HomeWork20;

public class MainShape {
    public static void main(String[] args) throws MyException{
        Rectangle rect1 = new Rectangle("Rect1", 10, 5);
        rect1.setColor("Green");
        System.out.println(rect1.toString());
        Circle circ1 = new Circle("Circ1", 10);
        circ1.setColor("Red");
        System.out.println(circ1.toString());
        Triangle trg1 = new Triangle("Triangle1", 5,6,12);
        System.out.println(trg1.toString());
        Shape [] shapes = new Shape[3];
        shapes[0] = rect1;
        shapes[1] = circ1;
        shapes[2] = trg1;

        for(int i = 0; i < shapes.length; i++) {
            System.out.printf("Perimeter = %.2f\n", shapes[i].getPerimeter());
            System.out.printf("Area = %.2f\n", shapes[i].calculateArea());
        }

    }
}
