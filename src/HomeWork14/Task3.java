package HomeWork14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку Кирилицей или Латиницей");
        String strTest = scan.nextLine();
        System.out.println(countLetters(strTest));

    }
    private static String countLetters(String strTest) {
        if(strTest != null && !strTest.trim().isEmpty()) {
            strTest = strTest.toLowerCase();
            String lettersVowels = "aeiouyаеёиоуыэюя";
            String lettersConsonants = "qwrtplkjhgfdszxcvbnmйцкнгшщзхфвпрлджбтмсч";
            String lettersOut = "";
            int counterLettVow = 0, counterCons = 0;
            for (int i = 0; i < strTest.length(); i++) {
                if (lettersVowels.contains(Character.toString(strTest.charAt(i)))) {
                    counterLettVow++;
                } else {
                    if (lettersConsonants.contains(Character.toString(strTest.charAt(i)))) {
                        counterCons++;
                    }
                }
            }
            lettersOut = String.format("В строке %d гласных %d согласных %d прочих символов",
                    counterLettVow, counterCons, (strTest.length() - counterLettVow - counterCons));
            return lettersOut;
        } else {
            return "Это не строка или она пустая";
        }
    }
}
