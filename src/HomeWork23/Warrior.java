package HomeWork23;

public class Warrior extends GameCharacter{
    public Warrior(String name, String weapon) {
        super(name, weapon);
    }

    @Override
    public void attack() {
        System.out.printf("Warrior %s attack with %s\n", name, weapon);
    }
}
