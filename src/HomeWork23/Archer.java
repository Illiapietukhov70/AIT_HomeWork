package HomeWork23;

public class Archer extends GameCharacter{
    public Archer(String name, String weapon) {
        super(name, weapon);
    }

    @Override
    public void attack() {
        System.out.printf("Archer %s attack with %s\n", name, weapon);
    }
}
