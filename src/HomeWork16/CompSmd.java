package HomeWork16;

public class CompSmd {
    String compName; // Уникальное имя на плате "R01" или "V124"
    String packType; // Тип корпуса - благодаря чему генерятся размеры и прочее "R0603" или "SOT23"
    int compSapNumber;// Учетный номер в системе учета "321456"

    public CompSmd(String compName, String packType, int compSapNumber) {
        this.compName = compName;
        this.packType = packType;
        this.compSapNumber = compSapNumber;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType;
    }

    public int getCompSapNumber() {
        return compSapNumber;
    }

    public void setCompSapNumber(int compSapNumber) {
        this.compSapNumber = compSapNumber;
    }

    @Override
    public String toString() {
        return "CompSmd{" +
                "compName='" + compName + '\'' +
                ", packType='" + packType + '\'' +
                ", compSapNumber=" + compSapNumber +
                '}';
    }
}