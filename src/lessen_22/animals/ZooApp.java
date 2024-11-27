package lessen_22.animals;

public class ZooApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.voice();
        cat.eat("Fish");
        Dog dog = new Dog();
        System.out.println(dog.toString());
        dog.voice();
        System.out.println(dog.toString());
        Hamster hamster = new Hamster();

        hamster.voice();
        System.out.println(hamster);






    }
}
