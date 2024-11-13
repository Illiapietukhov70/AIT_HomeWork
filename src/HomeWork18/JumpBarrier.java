package HomeWork18;

public class JumpBarrier {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik");
        Dog dog1 = new Dog(16.736, "Bobik");
        System.out.println(dog.getDogHighJump());
        System.out.println(dog1.getDogHighJump());
        System.out.println(dog.ableJump());
        System.out.println(dog1.ableJump());
        System.out.println(dog.makeTraining());
        System.out.println(dog1.makeTraining());
        dog.jumpBarrier(30.45);
        dog.jumpBarrier(50.34);
        Dog dog2 = new Dog(50.37746, "Murzik");
        dog2.jumpBarrier(100);
        Dog dog3 = new Dog(15, "Belka");
        dog3.jumpBarrier(30);
        Dog dog4 = new Dog (-45.4, "Strelka"); // проба на ошибку с отрицательным стартом
        System.out.println(dog4.getDogHighJump() + " I'm Strelka"); // по умолчанию
    }
}
