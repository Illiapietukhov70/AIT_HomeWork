package HomeWork21;

public class TestComputer {
    public static void main(String[] args) {
        Computer comp = new Computer();
        System.out.println(comp.getMemory().getBrand());
        System.out.println(comp.getProcessor().getBrand());
        comp.getProcessor().setBrand("AMD");
        System.out.println(comp.getProcessor().getBrand());


    }
}
