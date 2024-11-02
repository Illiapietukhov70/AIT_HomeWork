package HomeWork15;

public abstract class CompSMD {
    String compName;
    String packType;
    int compSapNumber;
    double compGlobalX;
    double compGlobalY;
    int compGlobalRot;

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