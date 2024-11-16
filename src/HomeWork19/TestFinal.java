package HomeWork19;

public class TestFinal {
    public static void main(String[] args) {
        //Task2 Task3 Task4
        final int MAX_USERS = 100;

        // MAX_USERS = 666;

        /*
        Во первых это примитив (т е не изменяем по сути) + Во вторых мы объявили его immutable
        Я догадываюсь - > т к в Java не возможно
        String  str = "nameObj";
        Obj nameObj = new Obj; (физическое имя не имеет сущности )
        Скорее всего из за типизации = здесь создается "поле имен Объектов" ->  которые имеют атрибуты, как
        файлы в ОС типо -> RWX на каждый случай базовый клас / конструктор и т д
        Объявили final ->  убрали атрибут W с сылки имени и т.д.
        В Питоне из за интерпретации, данный трюк с именами и доступом проходит на ура
        Поэтому
        "from typing import Final
        MY_CONSTANT: Final = 1"
        Но это мои мысли
         */

        printMessage("Это мои мысли");

    }
    public static void printMessage(final String str) { // При вызове метода с передачей ему Строки = происходит первое присвоение
        // static -  иначе нельзя обратится из psvm
        //str = "Это NOT мои мысли "; и теперь объект immutable и строка не изменяемый тип
        System.out.println(str);
    }

    public class TestInt {
        final int x;
        final int y;

        public TestInt(int y, int x) {
            this.y = y; // Физически здесь первый раз присвоены значения
            this.x = x;
        }
        public void setTestInt(int a, int b) {
            //this.x = a; соответственно все попытки изменить не возможны
            //this.y = b;
        }
    }

}


