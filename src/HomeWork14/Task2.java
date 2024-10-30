package HomeWork14;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] testArray = generRandomArr();
        System.out.println(Arrays.toString(testArray));
        System.out.println(twoMaxNumber(testArray));



        Arrays.sort(testArray); // Для проверки через сорт
        System.out.println(testArray[testArray.length - 2]); // max2 = второй с конца сортирового массива

    }
    public static int[] generRandomArr() {
        int arraySortLength = new Random().nextInt(2,100);
        int[] arrayOut = new int[arraySortLength];
        for (int i =0; i< arrayOut.length; i++) {
            arrayOut[i] = new Random().nextInt(-1000, 1000);
        }
        return arrayOut;
    }
    private static int twoMaxNumber(int[] inputArray){

        int max1 = 0, max2 = 0; // Массив не проверяю т.к. генерится и минимум 2- элемента
        max1 = inputArray[0] > inputArray[1]? inputArray[0]: inputArray[1];
        max2 = inputArray[0] < inputArray[1]? inputArray[0]: inputArray[1];

        for(int i = 2; i < inputArray.length; i++) {
            if(inputArray[i] >= max1){
                int temp = max1;
                max1 = inputArray[i];
                max2 = temp;
            } else {
                if(inputArray[i]>= max2){
                    max2 = inputArray[i];
                }
            }
        }
        return max2;
    }
}
