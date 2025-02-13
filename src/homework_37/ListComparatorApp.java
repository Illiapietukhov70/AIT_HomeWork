package homework_37;

public class ListComparatorApp {
    public static void main(String[] args) {
        ListComparator listComparator = new ListComparator();
        System.out.println(listComparator.getAllElementsByIndex(listComparator.getListArray()) + " ListArray getAllElementsByIndex");
        System.out.println(listComparator.getAllElementsByIndex(listComparator.getListLinked()) + " ListLinked getAllElementsByIndex");
        System.out.println("=============================================");
        System.out.println(listComparator.addElementsByIndex(listComparator.getListArray()) + " ListArray addElementsByIndex");
        System.out.println(listComparator.addElementsByIndex(listComparator.getListLinked()) + " ListLinked addElementsByIndex");
        System.out.println("=============================================");
        System.out.println(listComparator.removeElementsByIndex(listComparator.getListArray()) + " ListArray removeElementsByIndex");
        System.out.println(listComparator.removeElementsByIndex(listComparator.getListLinked()) + " ListLinked removeElementsByIndex");
        System.out.println("=============================================");
        System.out.println(listComparator.removeElementsByNamen(listComparator.getListArray()) + " ListArray removeElementsByNamen");
        System.out.println(listComparator.removeElementsByNamen(listComparator.getListLinked()) + " ListLinked removeElementsByNamen");
        System.out.println("=============================================");
        System.out.println(listComparator.fullTestMethod(listComparator.getListArray()) + " ListArray fullTestMethod");
        System.out.println(listComparator.fullTestMethod(listComparator.getListLinked()) + " ListLinked fullTestMethod");

    }
}
