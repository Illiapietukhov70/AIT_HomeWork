package HomeWork15;
/*
Класс описывающий ПИН Элемента
 */

public class Pin {
    public int pinNumber;//Номер ПИН
    public int pinLength;
    public int pinWigth;
    public int pinHigth;
    public int pinRot;// Поворот относительно ПИН 1 к примеру Резистор ротПИН 2 = 180 градусов


    public Pin(int pinNumber, int pinLength, int pinWigth, int pinHigth, int pinRot) {
        this.pinNumber = pinNumber;
        this.pinLength = pinLength;
        this.pinWigth = pinWigth;
        this.pinHigth = pinHigth;
        this.pinRot = pinRot;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getPinLength() {
        return pinLength;
    }

    public void setPinLength(int pinLength) {
        this.pinLength = pinLength;
    }

    public int getPinWigth() {
        return pinWigth;
    }

    public void setPinWigth(int pinWigth) {
        this.pinWigth = pinWigth;
    }

    public int getPinHigth() {
        return pinHigth;
    }

    public void setPinHigth(int pinHigth) {
        this.pinHigth = pinHigth;
    }

    public int getPinRot() {
        return pinRot;
    }

    public void setPinRot(int pinRot) {
        this.pinRot = pinRot;
    }

}

