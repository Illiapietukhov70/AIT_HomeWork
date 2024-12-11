package HomeWork26;

public class NumericPairApp {
    public static void main(String[] args) {
        NumericPair<Integer, Double> mixPair = new NumericPair<>(10, 20.4);
        System.out.println(mixPair.sum()); // Вывод: 30.4

        NumericPair<Double, Integer> mixPair1 = new NumericPair<>(5.5, 4);
        System.out.println(mixPair1.sum());// Вывод: 9.4
        System.out.println(mixPair1.getNumberTwo());// Ожидаем Интегер


    }
}
