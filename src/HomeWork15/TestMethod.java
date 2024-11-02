package HomeWork15;
/*
Абстрактный класс теста Элемента
 */

public abstract class TestMethod {
    String testMethod; // Имя теста
    String testUnit;// Единица измерения

    public TestMethod() {
    }

    public String getTestMethod() {
        return testMethod;
    }

    public String getTestUnit() {
        return testUnit;
    }
}
