package lesson_23;

import java.util.ArrayList;

public class ChTest extends MainStatTest{
    private String name;
    private TempClass tempClass;

    public ChTest(String name) {
        this.name = name;
        this.tempClass = new TempClass(String.format("Temp %s", this.name));

    }
    public void setSuperArr () {
        setMainArr(tempClass);
    }
    public ArrayList<TempClass > getSuperArr () {
        return getMainArr();
    }
}
