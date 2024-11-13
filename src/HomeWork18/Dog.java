package HomeWork18;


public class Dog {
    static  final double STEPJUMP = 10; // проба с Константой
    private double dogHighJump = 15.43;
    private double jumpLimit;
    private String dogName;

    public Dog(String dogName) {     // Если забыли ввести стартовую возможность собаки = ставим по умолчанию
        this.dogHighJump = dogHighJump;
        this.dogName = dogName;
        this.jumpLimit =dogHighJump * 2;

    }

    public Dog(double dogHighJump, String dogName) {
        this(dogName); // просто хотел использовать перегрузку для практики
        this.dogHighJump = dogHighJump > 0? dogHighJump: 15.43; // по хорошему, нужно с исключением... пока руки не дошли
        this.jumpLimit = dogHighJump * 2;

    }

    public String getDogName() {
        return dogName;
    }

    public double getDogHighJump() {
        return dogHighJump;
    }
    public double ableJump() {
        System.out.printf("I can Jump on: %.2f cm\n", dogHighJump);
        return  dogHighJump;
    }
    public double makeTraining () {
        System.out.printf("I'm %s und i doing training jumps!\n", dogName);
        dogHighJump = jumpLimit >= dogHighJump + STEPJUMP ? dogHighJump + STEPJUMP : jumpLimit;
        System.out.printf("I'm %s, I can Jump on: %.2f cm\n", dogName, dogHighJump);
        return dogHighJump;
    }
    public void jumpBarrier(double highBarrier) {
        if(highBarrier >= 0 && highBarrier <= jumpLimit) {
            while (dogHighJump < highBarrier) {
                makeTraining();
            }
            System.out.printf("I'm %s -> I did it\n", dogName);
        }
        else {
            System.out.printf("I'm %s this Barrier %.2f cm idiotic goal\n", dogName, highBarrier);
        }
    }

}
