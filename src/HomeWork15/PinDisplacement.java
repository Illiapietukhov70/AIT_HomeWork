package HomeWork15;

/*
Класс описывающий проверку ПИНов (контактов) микросхем / смещение от ожидаемого места длину и ширину посадки ПИН
Проверка ПИН типо GullWing QFP SOT SOIC и далее
*/

public class PinDisplacement extends TestMethod {
    private String testMethod = "PinDisplacement";
    private String testUnit = "um";
    private int [] minTestParametr = {0, 0, 0, 100}; // pinX, pinY, pinlength, pinWidth
    private int [] maxTestParametr = {200, 200, 3000, 3000}; // pinX, pinY, pinlength, pinWidth
    private int [] testInputData = new int[4];// pinX, pinY, pinlength, pinWidth
    private int [] correctTestParametr = new int[4];// pinX, pinY, pinlength, pinWidth
    private boolean isInputDataCorrect;
    private boolean testPasset;

    public PinDisplacement(int [] testInputData, int [] correctTestParametr) {
        this.testInputData = testInputData;
        this.correctTestParametr = correctTestParametr;
    }

    @Override
    public String getTestUnit() {
        return testUnit;
    }

    @Override
    public String getTestMethod() {
        return testMethod;
    }

    public int[] getMaxTestParametr() {
        return maxTestParametr;
    }

    public int[] getMinTestParametr() {
        return minTestParametr;
    }

    public int[] getCorrectTestParametr() {
        return correctTestParametr;
    }

    public int[] getTestInputData() {
        return testInputData;
    }

    public boolean isInputDataCorrect(int [] minTestParametr, int[] maxTestParametr, int[] testInputData, int[] correctTestParametr) {
        assert (testInputData == null && testInputData.length == 4 ): "Input Data False";
        assert ( correctTestParametr== null && correctTestParametr.length == 4 ): "Correct Data False";
        isInputDataCorrect = true;
        for(int i = 0; i < 4; i++) {
            boolean tempTestResult = testInputData[i] < minTestParametr[i]? false: testInputData[i] > maxTestParametr[i]? false:true;
            isInputDataCorrect &= tempTestResult;
        }
        return isInputDataCorrect;
    }

    public boolean isTestPasset(int []testInputData, int []correctTestParametr) {
        if (isInputDataCorrect) {
            for(int i = 0; i < 4; i++) {
                boolean tempTestResult = testInputData[i] > correctTestParametr[i]? true: false;
                testPasset &= tempTestResult;
            }
        }
        return testPasset;
    }
}

