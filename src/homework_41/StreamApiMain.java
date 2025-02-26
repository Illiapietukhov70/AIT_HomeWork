package homework_41;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;


public class StreamApiMain {
    public static void main(String[] args) {
        List<Integer> listInt = new Random().ints(-100, 100).limit(100).boxed().toList();
        System.out.println("=================Task1==================");
        System.out.println(sortedTask1(listInt));

        String string = "О сколько нам открытий чудных " +
                "Готовят просвещенья дух " +
                "И Опыт, [сын] ошибок трудных, " +
                "И Гений, [парадоксов] друг, " +
                "[И Случай, бог изобретатель]";
        List<String> stringList = Arrays.asList(string.toLowerCase().replaceAll("[^a-zA-Z0-9а-яА-Я ]", "").split(" "));
        System.out.println("===============Task2===============");
        System.out.println(sortedTask2(stringList)); // выбрал букву "и" - так как много в строке

        Student student = new Student("Vasya", 19, 'm', 1, "Berlin");
        Student student2 = new Student("Olya", 28, 'f', 3, "FM" );
        Student student3 = new Student("Dima", 22, 'm', 2, "Köln" );
        Student student4 = new Student("Lora", 32, 'f', 1, "Berlin" );
        Student student5 = new Student("Sacha", 18, 'm', 6, "Hamburg");

        List<Student> studentList = Arrays.asList(student, student2, student3, student4, student5);
        System.out.println("===============Task3===============");
        System.out.println(sortedTask3(studentList));


    }
    public static List<Integer> sortedTask1(List<Integer> list) {
        return list.stream().filter(elem -> elem < 100 && elem > 10 && elem % 2 == 0).toList();
    }
    public static List<String> sortedTask2(List<String> list) {
        return list.stream().filter(elem -> elem.charAt(0) == 'и').sorted(Comparator.naturalOrder()).toList();
    }

    public static List<Student> sortedTask3(List<Student> list) {
        return list.stream().filter(elem -> elem.getCity().equals("Berlin") && elem.getAge() > 25).toList();
    }
}
