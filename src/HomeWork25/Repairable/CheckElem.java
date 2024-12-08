package HomeWork25.Repairable;

public class CheckElem {
    private String name;
    private double repairCost;
    private int repairTime;

    public CheckElem(String name, double repairCost, int repairTime) {
        this.name = name;
        this.repairCost = repairCost;
        this.repairTime = repairTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(double repairCost) {
        this.repairCost = repairCost;
    }

    public int getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(int repairTime) {
        this.repairTime = repairTime;
    }
}
