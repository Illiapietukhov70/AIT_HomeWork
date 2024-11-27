package lessen_22.animals;

public class Hamster extends Animal{
    @Override
    public void voice() {
        System.out.println("Hrum Hrum");
    }

    @Override
    public String toString() {
        return super.toString() + " I Hamster :)";
    }
}
