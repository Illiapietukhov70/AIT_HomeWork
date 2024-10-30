package HomeWork14;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] arrayTask1 = Task2.generRandomArr();
        //System.out.println(Arrays.toString(arrayTask1));
        System.out.println("Summ: " + summArray(arrayTask1));

    }
    private static int summArray(int[] inputArray){
        int countSumm = 0;
        for (int i = 0; i < inputArray.length; i++ ) {
            if (inputArray[i] % 2 == 0) {
                countSumm += inputArray[i];
            }
        }
        return  countSumm;
    }


}
