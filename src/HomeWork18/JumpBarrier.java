package HomeWork18;

import java.util.Arrays;
import java.util.Random;

public class JumpBarrier {
    public static void main(String[] args) {

        String [] dogNameArray = {"Sharik", "Bobik", "Murzik", "Belka","Strelka"};
        Dog [] dogArray = new Dog[5];
        for(int i = 0; i < dogArray.length; i++) {
            Dog dog = new Dog(new Random().nextDouble(30,80.), dogNameArray[i]);
            dogArray[i] = dog;
        }
        double[] barrierArray = new double[7];
        for(int j = 0; j < barrierArray.length; j++) {
            barrierArray[j] = new Random().nextDouble(70, 170.);
        }

        for(int i = 0; i < dogArray.length; i++) {
            for(int j = 0; j < barrierArray.length; j++) {
                dogArray[i].jumpBarrier(barrierArray[j]);
            }
        }
        System.out.println("===================================================");

        System.out.println(Dog.countGlobalBarrier + " Sum Barriers all Dogs");  // Сколько Всех барьеров взяли Все собаки
        System.out.println(Dog.countTrening + " Sum Training made all Dogs");  // Сколько тренеровок сделали Все собаки
        System.out.println("===========Array Barriers===============================");
        System.out.println(Arrays.toString(barrierArray));


        for(int i = 0; i < dogArray.length; i++) {
            System.out.printf("I'm %s and i did %d Barriers\n", dogArray[i].getDogName(), dogArray[i].getCountLocalBarrier());
            System.out.printf("My Barrier Limit is: %.2f\n", dogArray[i].getJumpLimit());
        }



    }
}
