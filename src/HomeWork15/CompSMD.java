package HomeWork15;
/*
Базовый абстрактный класс описывающий Компонент (электронной платы), установленный на плате и требующий проверку(множественных тестов)
 */
public abstract class CompSMD {
    String compName; // Уникальное имя на плате "R01" или "V124"
    String packType; // Тип корпуса - благодаря чему генерятся размеры и прочее "R0603" или "SOT23"
    int compSapNumber;// Учетный номер в системе учета "321456"
    double compGlobalX;// Глобальное позиционирование (геометрический центр Элемента на плате) по оси X um
    double compGlobalY;//Глобальное позиционирование (геометрический центр Элемента на плате) по оси Y um
    int compGlobalRot;//Глобальное позиционирование (геометрический центр Элемента на плате) поворот при монтаже Grad

    public CompSMD(String compName, String packType, int compSapNumber, double compGlobalX, double compGlobalY, int compGlobalRot) {
        this.compName = compName;
        this.packType = packType;
        this.compSapNumber = compSapNumber;
        this.compGlobalX = compGlobalX;
        this.compGlobalY = compGlobalY;
        this.compGlobalRot = compGlobalRot;
    }

    public String getCompName() {
        return compName;
    }

    public String getPackType() {
        return packType;
    }

    public int getCompSapNumber() {
        return compSapNumber;
    }

    public double getCompGlobalX() {
        return compGlobalX;
    }

    public double getCompGlobalY() {
        return compGlobalY;
    }

    public int getCompGlobalRot() {
        return compGlobalRot;
    }

    }