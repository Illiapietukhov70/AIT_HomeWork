package homework_42;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListManipulApp {
    public static void main(String[] args) {
        /*

Task 4 Опционально
Напишите метод findUserById(int id), который возвращает Optional<User>. Метод принимает List<User> и int id.
Если пользователь с заданным id существует в списке, вернуть Optional с пользователем, иначе вернуть Optional.empty().
Подсказка:
Используйте Optional.of(user) или Optional.empty().
       */

        List<Integer> integerList = Stream.generate(() -> new Random().nextInt(-1000,1000)).limit(20).toList();
        //Task1
        lastNumberList(integerList);
        //Task2
        String string = "О сколько нам открытий чудных " +
                "Готовят просвещенья дух " +
                "И Опыт, [сын] ошибок трудных, " +
                "И Гений, [парадоксов] друг, " +
                "[И Случай, бог изобретатель]";
        List<String> stringList = Arrays.asList(string.replaceAll("[^a-zA-Z0-1а-яА-Я ]", "").split(" "));
        System.out.println(sortedSizeStringList(stringList)); // Первая с минимальной длинной
        //Task3
        List<Integer> newIntegerResultList = new ArrayList<>(listFilterNumbers(integerList));
        //Task4
        User user1 = new User("Masha", 19, 1);
        User user2 = new User("Vasya", 20, 2);
        User user3 = new User("Dasha", 99, 3);
        User user4 = new User("Vitya", 22, 4);
        User user5 = new User("Goga", 2, 5);
        List<User> userList = Arrays.asList(user1, user2, user3, user4, user5);

        System.out.println(returnUserById(userList, 6));
        System.out.println(returnUserById(userList, 1));

        /* Немного не понял зачем "Используйте Optional.of(user) или Optional.empty()."
            если мы явно можем вернуть Option?
            Может быть распечатать или User или если Optional.empty() == true -> "User = null!"
         */


    }
    static void lastNumberList(List<Integer> integerList) {
        integerList.stream()
                .filter(integer -> integer > 10)
                .sorted(Comparator.comparing(num -> num % 10))
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
    static String sortedSizeStringList(List<String> stringList) {
        return stringList.stream()
                .sorted(Comparator.comparing(str -> str.length()))
                .findFirst()
                .get();
    }
    static List<Integer> listFilterNumbers(List<Integer> integerList) {
        return integerList.stream().filter(num -> num % 2 == 0).map(num -> num * 2).toList();
    }
    static Optional<User> returnUserById(List<User> userList, int id) {
        return userList.stream().filter(u -> u.getId() == id).findFirst();
    }
}
