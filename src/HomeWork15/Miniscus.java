package HomeWork15;

public class Miniscus extends TestMethod {
    private String testMethod = "Miniscus";
    private String testUnit = "Abs Unit";
    private int minTestParametr = 0;
    private int maxTestParametr = 1000;
    private int correctTestParametr;
    private int testInputData;
    private boolean testPasset;

    public Miniscus( int correctTestParametr) {
        this.correctTestParametr = correctTestParametr; // 700

    }

    @Override
    public String getTestUnit() {
        return testUnit;
    }

    @Override
    public String getTestMethod() {
        return testMethod;
    }

    public void setTestInputData(int testInputData) {
        this.testInputData = testInputData;
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

    public boolean isInputDataCorrect(int testInputData) {
        boolean resultInputDataCorrect = false;
        if (testInputData % 1 != 0) {
            resultInputDataCorrect = false;
        } else {
            resultInputDataCorrect = testInputData < this.minTestParametr ? false : testInputData > this.maxTestParametr ? false : true;
        }
        return resultInputDataCorrect;
    }

    public boolean isTestPasset(int testInputData) {
        if (isInputDataCorrect(testInputData)) {
            testPasset = testInputData > this.correctTestParametr ? true : false;

        }
        return testPasset;
    }
}

