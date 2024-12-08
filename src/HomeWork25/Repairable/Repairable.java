package HomeWork25.Repairable;

public interface Repairable {

    CheckElem diagnose(CheckElem elem);//провести диагностику устройства.
    CheckElem repair(CheckElem elem); // выполнить ремонт устройства.
    double getRepairCost(CheckElem elem);// получить стоимость ремонта.

}
