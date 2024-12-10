package HomeWork25.Repairable;

import HomeWork25.MagicArrayGen.MagicArrayGen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public abstract class Gadget implements Repairable {
    protected String ownerName;
    protected String model;
    public static MagicArrayGen<CheckElem> magicArrayGen = new MagicArrayGen<>();

    public Gadget(String ownerName, String model) {
        this.ownerName = ownerName;
        this.model = model;
    }

    @Override
    public CheckElem diagnose(CheckElem elem) {
        System.out.printf("Диагностика устройства: %s владельца %s.\n", model, ownerName);
        System.out.printf("Проверка %s...\n", elem.getName());
        return elem;
    }

    @Override
    public CheckElem repair(CheckElem elem) {
        System.out.println("Ремонт начат.");
        System.out.printf("Замена %s завершена.\n", elem.getName());
        System.out.printf("Стоимость ремонта: %.2f USD\n", getRepairCost(elem));
        System.out.printf("Время ремонта %d min \n", elem.getRepairTime());
        System.out.println();
        return elem;

    }

    @Override
    public double getRepairCost(CheckElem elem) {
        if(!magicArrayGen.contains(elem)) {
            System.out.println("Данной запчасти нет БД!");
            setRepairCostDict(elem);
        }
        return elem.getRepairCost();
    }


    public static void setRepairCostDict(CheckElem elem) {
        magicArrayGen.append(elem);
    }
}
