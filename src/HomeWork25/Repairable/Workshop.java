package HomeWork25.Repairable;

public class Workshop {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lena", "Ipad_12_inch");

        CheckElem elem1 = new CheckElem("экран", 124, 24);
        CheckElem elem2 = new CheckElem("батарея", 88, 21);
        CheckElem elem3 = new CheckElem("жесткий диск", 124, 21);
        CheckElem elem4 = new CheckElem("система охлаждения",  12, 19);
        CheckElem elem5 = new CheckElem("кулер", 124, 30);

        Gadget.setRepairCostDict(elem1);
        Gadget.setRepairCostDict(elem2);
        Gadget.setRepairCostDict(elem3);
        Gadget.setRepairCostDict(elem4);
        Gadget.setRepairCostDict(elem5);

        Smartphone smartphone = new Smartphone("Tanya", "Samsung_123");

        processRepair(laptop, elem1);
        processRepair(smartphone, elem5);


        CheckElem elem6 = new CheckElem("клавиатура", 88, 21);// Данной запчасти нет в БД
        System.out.println(Gadget.repairCostDict.contains(elem6) + " = Eсть ли данная ЗП в БД");// Ожидаю False

        processRepair(smartphone, elem6);// По идее мы ее добавим в Статик лист абстракта
        System.out.println(Gadget.repairCostDict.contains(elem6) + " = Eсть ли данная ЗП в БД");// Ожидаю True

    }
    public static void processRepair(Gadget gadget, CheckElem elem) {
        gadget.diagnose(elem);
        gadget.repair(elem);
    }

}
