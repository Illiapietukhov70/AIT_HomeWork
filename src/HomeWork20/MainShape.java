package HomeWork20;

public class MainShape {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle("Rect1", 10, 5);
        rect1.setColor("Green");
        System.out.println(rect1.toString());
        Circle circ1 = new Circle("Circ1", 10);
        circ1.setColor("Red");
        System.out.println(circ1.toString());

    }
}
