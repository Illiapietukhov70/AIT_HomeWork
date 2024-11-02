package HomeWork15;

public class Bridge extends TestMethod {
    private String testMethod = "Bridge";
    private String testUnit = "Abs Unit";
    private int minTestParametr = 0;
    private int maxTestParametr = 1000;
    private int correctTestParametr;
    private int testInputData;
    private boolean isInputDataCorrect;
    private boolean testPasset;

    public Bridge( int testInputData, int correctTestParametr) {
        this.correctTestParametr = correctTestParametr; // 6
        this.testInputData = testInputData;
    }

    @Override
    public String getTestUnit() {
        return testUnit;
    }

    @Override
    public String getTestMethod() {
        return testMethod;
    }

    public int getMaxTestParametr() {
        return maxTestParametr;
    }

    public int getMinTestParametr() {
        return minTestParametr;
    }

    public int getTestInputData() {
        return testInputData;
    }

    public int getCorrectTestParametr() {
        return correctTestParametr;
    }

    public void setCorrectTestParametr(int correctTestParametr) {
        this.correctTestParametr = correctTestParametr;
    }

    public boolean isInputDataCorrect(int minTestParametr, int maxTestParametr, int testInputData) {
        if (testInputData % 1 != 0) {
            isInputDataCorrect = false;
        } else {
            isInputDataCorrect = testInputData < minTestParametr ? false : testInputData > maxTestParametr ? false : true;
        }
        return isInputDataCorrect;
    }

    public boolean isTestPasset(int testInputData, int correctTestParametr) {
        if (isInputDataCorrect) {
            testPasset = testInputData > correctTestParametr ? true : false;

        }
        return testPasset;
    }
}

