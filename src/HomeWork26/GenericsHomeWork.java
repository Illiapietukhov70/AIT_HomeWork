package HomeWork26;

import lists.MyArrayList;

public class GenericsHomeWork {
    public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);
        printTwoLists(names,scores);
    }
    public static <T, V>void printTwoLists(MyArrayList<T>names,MyArrayList<V> scores){
        System.out.print("// Вывод:");
        for (int i =0; i< names.size(); i++) {
            System.out.print( "//"+ names.get(i));
        }
        for (int j= 0; j< scores.size(); j++) {
            System.out.print("//" + scores.get(j));
        }
    }
}
