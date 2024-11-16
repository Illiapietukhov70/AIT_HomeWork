package HomeWork18;


public class Dog {
    private static  final double STEPJUMP = 10; // проба с Константой
    private double dogHighJump = 15.43;
    private double jumpLimit;
    private String dogName;
    public static int countTrening = 0;
    public static int countGlobalBarrier = 0; // Счет Всех прыжков класса (для понимания static)
    private int countLocalBarrier;// Счет прыжков каждого объекта

    public Dog(String dogName) {     // Если забыли ввести стартовую возможность собаки = ставим по умолчанию
        this.dogName = dogName;
        this.countLocalBarrier = 0;
        this.jumpLimit =dogHighJump * 2;

    }

    public Dog(double dogHighJump, String dogName) {
        this(dogName); // просто хотел использовать перегрузку для практики
        this.dogHighJump = dogHighJump > 0? dogHighJump: 15.43; // по-хорошему, нужно с исключением... пока руки не дошли
        this.jumpLimit =this.dogHighJump * 2;

    }
    public int getCountLocalBarrier() {
        return countLocalBarrier;
    }


    public void setDogName(String dogName) {
        this.dogName = dogName;
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
        countTrening++;
        dogHighJump = jumpLimit >= dogHighJump + STEPJUMP ? dogHighJump + STEPJUMP : jumpLimit;
        System.out.printf("I'm %s, I can Jump on: %.2f cm\n", dogName, dogHighJump);
        return dogHighJump;
    }
    public void jumpBarrier(double highBarrier) {
        if(highBarrier >= 0 && highBarrier <= jumpLimit) {
            while (dogHighJump < highBarrier) {
                makeTraining();
            }
            countGlobalBarrier++;
            countLocalBarrier++;
            System.out.printf("I'm %s -> I did it\n", dogName);
        }
        else {
            System.out.printf("I'm %s this Barrier %.2f cm idiotic goal\n", dogName, highBarrier);
        }
    }
    public double getJumpLimit() {
        return jumpLimit;
    }
}
