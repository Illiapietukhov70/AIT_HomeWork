package homework_39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyDictionary {
    public static void main(String[] args) {
        String string = "О сколько нам открытий чудных " +
                "Готовят просвещенья дух " +
                "И Опыт, [сын] ошибок трудных, " +
                "И Гений, [парадоксов] друг, " +
                "[И Случай, бог изобретатель]";
        Map<String, Integer> mapWords = new HashMap<>(makeDictionary(string));
        mapWords.forEach((k, v) -> System.out.println(k + " : " + v));

        Map<String, Integer> map = new HashMap<>(makeDictionaryChar(string));
        map.forEach((k, v) -> System.out.print("'" + k + "'" + ": " + v +";"));

    }
    public static Map<String, Integer> makeDictionary (String string) {
        List<String> stringList = new ArrayList<>(List.of(string.toLowerCase().replaceAll("[^a-zA-Z0-9а-яА-Я ]", "").split(" ")));
        Map<String, Integer> map = new HashMap<>();
        for (String s : stringList) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }
    public static Map<String, Integer> makeDictionaryChar (String string) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            map.put(string.substring(i, i + 1), map.getOrDefault(string.substring(i, i + 1), 0) + 1);
        }
        return map;
    }
}
