package HomeWork15;

public class Main {
    public static void main(String[] args) {
        ResistorSMD firstResistor = new ResistorSMD("R1", "R1206", 760123, 36600, 76887, 45, true);
        System.out.println(firstResistor);
        int qtyPins = firstResistor.pins.length;
        for (int i = 0; i < qtyPins; i++) {
            System.out.println("Pin Number " + firstResistor.pins[i].getPinNumber() + ": " + firstResistor.pins[i].getPinWigth());
        }
        TestMethod firstTest = firstResistor.pinTests.get(0);
        System.out.println("Correct Parametr for Pin Miniscus: " + ((Miniscus) firstTest).getCorrectTestParametr());
        System.out.println("Test result if Miniscus = 734: " + ((Miniscus)firstTest).isTestPasset(734));
        System.out.println("Make new Correct Parametr - 600 Units");
        ((Miniscus) firstTest).setCorrectTestParametr(600);
        System.out.println("Correct Parametr for Pin Miniscus: " + ((Miniscus) firstTest).getCorrectTestParametr());
        System.out.println("Test result if Miniscus = 513: " + ((Miniscus)firstTest).isTestPasset(513));
        TestMethod solderTest = firstResistor.pinTests.get(1);
        System.out.println("Correct Parametr for Pin Solder: " + ((Solder) solderTest).getCorrectTestParametr());
        System.out.println("Test result if Solder = 114: " + ((Solder)solderTest).isTestPasset(114));
        System.out.println("Make new Correct Parametr - 90 Units");
        ((Solder) solderTest).setCorrectTestParametr(90);
        System.out.println("Correct Parametr for Pin Solder: " + ((Solder) solderTest).getCorrectTestParametr());
        System.out.println("Test result if Solder = 73: " + ((Solder)solderTest).isTestPasset(73));

    }
}

