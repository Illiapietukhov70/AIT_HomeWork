package HomeWork15;
/*
Класс описывающий измерение Минискуса контакта (Линзы отражение света от места пайки = качесто пайки)
 */

public class Miniscus extends TestMethod {
    private String testMethod = "Miniscus";
    private String testUnit = "Abs Unit";// Условные единицы матрицы Машинного зрения
    private int minTestParametr = 0;
    private int maxTestParametr = 1000;
    private int correctTestParametr;// Проверка, что данные в рамках реалии (это ИИ тут все возможно), тест на отсутствие галюцинаций
    private int testInputData;// Результат измерения
    private boolean testPasset;// Тест пройден

    public Miniscus( int correctTestParametr) {
        this.correctTestParametr = correctTestParametr; // В конструкторе вводим эталон для сравнения = 700, результат должен быть больше
        // Это как бы по умолчанию - далее в сетере мы можем менять для специфики процесса

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
        if (testInputData % 1 != 0) {   // проверка на целое число и галюцинацию
            resultInputDataCorrect = false;
        } else {
            resultInputDataCorrect = testInputData < this.minTestParametr ? false : testInputData > this.maxTestParametr ? false : true;
        }
        return resultInputDataCorrect;
    }

    public boolean isTestPasset(int testInputData) {
        if (isInputDataCorrect(testInputData)) { // Сам Основной тест
            testPasset = testInputData > this.correctTestParametr ? true : false;

        }
        return testPasset;
    }
}

