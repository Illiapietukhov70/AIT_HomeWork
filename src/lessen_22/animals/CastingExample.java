package lessen_22.animals;

public class CastingExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = cat;
        Animal animal1 = new Cat();
        animal1.voice();
        Animal animal2 = new Dog();
        Animal animal3 = new Hamster();
        Animal [] animals = new Animal[3];
        animals[0] = animal1;
        animals[1] = animal2;
        animals[2] = animal3;
        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }
        Cat catLink;
        Animal animaLink = new Cat();
        catLink = (Cat) animaLink;
        ((Cat) animaLink).eat();
        catLink.eat();
        for (int i = 0; i < animals.length; i++) {
            Animal current = animals[i];
            System.out.println(current.getClass().getSimpleName());

            if(animals[i] instanceof Cat){
                Cat tempCat = (Cat) animals[i];
                tempCat.eat();
            }


            System.out.println("=================\n");
        }
    }
}
