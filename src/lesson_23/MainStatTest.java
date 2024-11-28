package lesson_23;

import java.util.ArrayList;

public class MainStatTest {
    private String name;
    private static ArrayList<TempClass> mainArr;

    public MainStatTest() {
        this.name = name;
        this.mainArr = new ArrayList<>();
    }

    public ArrayList<TempClass> getMainArr() {
        return mainArr;
    }

    public static void setMainArr(TempClass tempClass) {
        mainArr.add(tempClass);
    }
}

