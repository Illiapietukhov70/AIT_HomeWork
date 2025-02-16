package homework_38;

import java.util.*;

public class SetStringConverter {
    public static void main(String[] args) {
        String stringInput1 = "Жили да были король с королевой; жили они в полном" +
                " согласии и прижили двенадцать человек детей и все были мальчуганы." +
                "Вот король и говорит королеве: \"Если тринадцатый ребенок, которого ты родишь," +
                " будет девочка, то всех двенадцать мальчишек велю убить," +
                " чтобы и богатства у ней было больше, и все наше королевство ей одной принадлежало";
        String stringInput2 = "Один отец жил с двумя сыновьями. Старший был умен, сметлив, и всякое дело у него спорилось в руках," +
                " а младший был глуп, непонятлив и ничему научиться не мог." +
                "Люди говорили, глядя на него: \"С этим отец еще не оберется хлопот!\" Когда нужно было сделать что-нибудь," +
                " все должен был один старший работать; но зато он был робок, и когда его отец за чем-нибудь посылал позднею порой," +
                " особливо ночью, и если к тому же дорога проходила мимо кладбища или иного страшного места," +
                " он отвечал: \"Ах, нет, батюшка, не пойду я туда! Уж очень боязно мне.\"";
        String stringInput3 = "Жили да были король с королевой";

        //Task 1
        List<String> strings = new ArrayList<>(convertStringToSet(stringInput1));
        strings.sort(Comparator.comparing(String::length));
        System.out.println(strings);
        //Task 2
        SetLogicConvertor setLogicConvertor = new SetLogicConvertor(convertStringToSet(stringInput1), convertStringToSet(stringInput2));
        System.out.println(setLogicConvertor.union());
        System.out.println(setLogicConvertor.intersection());
        System.out.println(setLogicConvertor.difference());
        //Task 3
        System.out.println(convertStringToChar(stringInput3));
    }
    public static Set<String> convertStringToSet(String stringInput) {
        Set<String> stringSet = new HashSet<>(List.of(stringInput.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "").split(" ")));
        return stringSet;
    }
    public static Character convertStringToChar(String stringInput) {
        String testString = stringInput.toLowerCase().replaceAll("[^a-zA-Z0-9а-яА-Я]", "");
        for (char c : testString.toCharArray()) {
            if (testString.indexOf(c) == testString.lastIndexOf(c)) {
                return c;
            }
        }
        return null;
    }
    public static class SetLogicConvertor {
        Set<String> stringSet1;
        Set<String> stringSet2;

        public SetLogicConvertor(Set<String> stringSet1, Set<String> stringSet2) {
            this.stringSet1 = stringSet1;
            this.stringSet2 = stringSet2;
        }
        public Set<String> union() {
            Set<String> unionSet = new TreeSet<>();
            unionSet.addAll(stringSet1);
            unionSet.addAll(stringSet2);
            return unionSet;
        }
        public Set<String> intersection() {
            Set<String> intersectionSet = new TreeSet<>();
            for (String s : stringSet1) {
                if (stringSet2.contains(s)) {
                    intersectionSet.add(s);
                }
            }
            return intersectionSet;
        }
        public Set<String> difference() {
            Set<String> differenceSet = new TreeSet<>();
            for (String s : stringSet1) {
                if (!stringSet2.contains(s)) {
                    differenceSet.add(s);
                }
            }
            return differenceSet;
        }
    }
}
