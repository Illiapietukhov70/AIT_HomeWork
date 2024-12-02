package HomeWork23;

public abstract class GameCharacter {
    protected String name;
    protected String weapon;

    public GameCharacter(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public abstract void attack();
}
