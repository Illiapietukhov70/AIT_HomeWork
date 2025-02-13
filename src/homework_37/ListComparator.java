package homework_37;

import java.lang.reflect.Array;
import java.util.*;


//Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
//
//Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.
//
//Создайте 4 метода, принимающий реализацию интерфейса List.
//
//В первом методе - получение всех значений элементов списка по его индексу
//Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
//Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
//Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
//Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.
//
//Сравните для каждого из списка время выполнения каждого метода.
//
//И сравните время последовательного выполнения всех методов для каждой реализации List-а.



public class ListComparator {
    List<Integer> listArray;
    List<Integer> listLinked;

    public ListComparator() {
        listArray = new ArrayList<>();
        listLinked = new LinkedList<>();


    }
    private Integer[] getTestResource () {
        Integer[] testResourceArray = new Integer[5000];
        for (int i = 0; i < testResourceArray.length; i++) {
            testResourceArray[i] = new Random().nextInt(1000);
        }
        return testResourceArray;
    }

    public long getAllElementsByIndex (List<Integer> testMethod) {
        Integer[] testResourceArray = getTestResource();
        Collections.addAll(testMethod, testResourceArray);
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < testMethod.size(); i++) {
            Integer tempResource = testMethod.get(i);
        }
        long timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }

    public long addElementsByIndex(List<Integer> testMethod) {
        Integer[] testResourceArray = getTestResource();
        Integer[] newArrayIndex = new Integer[5000];
        Collections.addAll(testMethod, testResourceArray);
        for (int i = 0; i < newArrayIndex.length; i++) {
            newArrayIndex[i] = new Random().nextInt(testResourceArray.length);
        }
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < newArrayIndex.length; i++) {
            testMethod.add(newArrayIndex[i], 888888);
        }
        long timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long removeElementsByIndex(List<Integer> testMethod) {
        Integer[] testResourceArray = getTestResource();
        Integer[] newArrayIndex = new Integer[5000];
        Collections.addAll(testMethod, testResourceArray);
        for (int i = 0; i < newArrayIndex.length; i++) {
            newArrayIndex[i] = new Random().nextInt(testResourceArray.length);
        }
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < newArrayIndex.length; i++) {
            testMethod.remove(newArrayIndex[i]);
        }
        long timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long removeElementsByNamen(List<Integer> testMethod) {
        Integer[] testResourceArray = getTestResource();
        Integer[] newArrayNamen = new Integer[1000];
        for (int i = 0; i < newArrayNamen.length; i++) {
            newArrayNamen[i] = new Random().nextInt(10000);
        }
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < newArrayNamen.length; i++) {
            testMethod.remove(newArrayNamen[i]);
        }
        long timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
    public long fullTestMethod(List<Integer> testMethod) {
        return this.getAllElementsByIndex(testMethod)
                + this.addElementsByIndex(testMethod)
                + this.removeElementsByIndex(testMethod)
                + this.removeElementsByNamen(testMethod);
    }





    public List<Integer> getListArray() {
        return listArray;
    }

    public void setListArray(List<Integer> listArray) {
        this.listArray = listArray;
    }

    public List<Integer> getListLinked() {
        return listLinked;
    }

    public void setListLinked(List<Integer> listLinked) {
        this.listLinked = listLinked;
    }
}
