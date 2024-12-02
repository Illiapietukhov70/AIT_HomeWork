package HomeWork23;

public class Mage extends GameCharacter {
    public Mage(String name, String weapon) {
        super(name, weapon);
    }

    @Override
    public void attack() {
        System.out.printf("Mage %s attack with %s\n", name, weapon);

    }
}
