package HomeWork26;

public class NumericPair <T extends Number, V extends Number> {
    private T numberOne;
    private V numberTwo;

    public NumericPair (T numberOne, V numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
    public double sum() {
        return (numberTwo.doubleValue()+ numberOne.doubleValue());
    }

    public T getNumberOne() {
        return numberOne;
    }

    public V getNumberTwo() {
        return numberTwo;
    }
    public void swap() {
         V tempTwo = (V) numberOne;
         T tempOne = (T) numberTwo;
         numberOne = tempOne;
         numberTwo = tempTwo;
    }
}
