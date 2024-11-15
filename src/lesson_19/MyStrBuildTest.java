package lesson_19;

public class MyStrBuildTest {
    public static void main(String[] args) {
        MyStrBuild bl1 = new MyStrBuild("Создать массив 'барьеров' на 7 значений. Заполнить массив случайными значениями от 70 до 170.");
        System.out.println(bl1.length());
        String strTest = "Создать массив 'барьеров' на 7 значений. Заполнить массив случайными значениями от 70 до 170.";
        System.out.println(strTest.length());
        System.out.println(bl1.toString());
        System.out.println(bl1.reverse());// работает
        System.out.println(bl1.toString()); // Изначальный Массив не изменился
        System.out.println("====================================");
        System.out.println(bl1.substring(10,20));
        System.out.println(bl1.substring(-2,-4));//TODO возможно еще вариант если -start a end в поле Изначального массива
        System.out.println(bl1.substring(10,100));// тут все четко
        System.out.println("====================================");
        bl1.append("Также можно использовать статический метод valueOf(char[]) класса String");
        System.out.println(bl1.toString()); // Вск ОК
        String [] superAppendArr = {"String", "String", "String"};
        bl1.append(superAppendArr);
        System.out.println(bl1.toString()); //OK
        System.out.println(bl1.length() + " До делейт");
        bl1.delete(93, 123);
        System.out.println(bl1.toString());
        System.out.println(bl1.length() + " После"); // Все четко 20 знаков
        bl1.delete(93,300);
        System.out.println(bl1.toString());
        bl1.append("+"); // 93 символ
        System.out.println(bl1.toString());
        bl1.deleteCharAt(93);
        System.out.println(bl1.toString());//OK
        bl1.replace(50, 70,"StringStringStringString");
        System.out.println(bl1.toString()); //OK
        bl1.replace(20, 70,"StringStringStringString");
        System.out.println(bl1.toString()); //OK
        bl1.replace(30, 150, "skdkdksdsk"); // все границы ОК
        bl1.setLength(20);
        System.out.println(bl1.toString());
        System.out.println(bl1.length());// 20
        bl1.setLength(50);
        System.out.println(bl1.toString());
        System.out.println(bl1.length());// OK


    }
}
