package HomeWork15;

import java.util.ArrayList;
import java.util.Arrays;

public class ResistorSMD extends CompSMD {
    private String compName;
    private String packType;
    private int compSapNumber;
    private double compGlobalX;
    private double compGlobalY;
    private int compGlobalRot;
    private int compLength;
    private int compHigth;
    private int compWidth;
    private boolean polary;
    final int pinCount = 2;
    Pin[] pins;
    ArrayList<TestMethod> pinTests = new ArrayList<>();


    public ResistorSMD(String compName, String packType, int compSapNumber, double compGlobalX, double compGlobalY, int compGlobalRot, boolean polary) {
        super(compName, packType, compSapNumber, compGlobalX, compGlobalY, compGlobalRot);
        this.compName = compName;
        this.packType = packType;
        this.compSapNumber = compSapNumber;
        this.compGlobalX = compGlobalX;
        this.compGlobalY = compGlobalY;
        this.compGlobalRot = compGlobalRot;
        this.polary = polary;
        this.pins = new Pin[pinCount];
        this.pinTests = new ArrayList<>();
        setCase(packType);
        setPinResistor(this.packType, pins);
        setPinTest(pinTests);



    }

    @Override
    public String getCompName() {
        return compName;
    }

    public String getPackType() {
        return packType;
    }

    @Override
    public int getCompSapNumber() {
        return compSapNumber;
    }

    @Override
    public double getCompGlobalX() {
        return compGlobalX;
    }

    @Override
    public double getCompGlobalY() {
        return compGlobalY;
    }

    @Override
    public int getCompGlobalRot() {
        return compGlobalRot;
    }

    private int getCompHigth() {
        return compHigth;
    }

    private void setCompHigth(int compHigth) {
        this.compHigth = compHigth;
    }

    private void setCase(String packType) {
        if (packType.equals("R0201")) {
            compLength = 600;
            compWidth = 300;
        } else {
            if (packType.equals("R0402")) {
                compLength = 1000;
                compWidth = 500;
            } else {
                if (packType.equals("R0603")) {
                    compLength = 1500;
                    compWidth = 800;
                } else {
                    if (packType.equals("R0805")) {
                        compLength = 2000;
                        compWidth = 1300;
                    } else {
                        if (packType.equals("R1008")) {
                            compLength = 2500;
                            compWidth = 2000;
                        } else {
                            if (packType.equals("R1206")) {
                                compLength = 2500;
                                compWidth = 2000;
                            } else {
                                System.out.println("Wrong Type of Resistor");
                            }
                        }
                    }
                }
            }
        }
    }
    @Override
    public String toString() {
        return "ResistorSMD{" +
                "compName='" + compName + '\'' +
                ", packType='" + packType + '\'' +
                ", compSapNumber=" + compSapNumber +
                ", compGlobalX=" + compGlobalX +
                ", compGlobalY=" + compGlobalY +
                ", compGlobalRot=" + compGlobalRot +
                ", compLength=" + compLength +
                ", compHigth=" + compHigth +
                ", compWidth=" + compWidth +
                ", polary=" + polary +
                ", pinCount=" + pinCount +
                '}';
    }

    private static Pin[] setPinResistor(String packType, Pin[] pins) {
        int pinWidth = 100, pinLength = 100;
        if (packType.equals("R0201")) {
            pinLength = 100;
            pinWidth = 320;
        } else {
            if (packType.equals("R0402")) {
                pinLength = 120;
                pinWidth = 520;
            } else {
                if (packType.equals("R0603")) {
                    pinLength = 150;
                    pinWidth = 820;
                } else {
                    if (packType.equals("R0805")) {
                        pinLength = 200;
                        pinWidth = 1320;
                    } else {
                        if (packType.equals("R1008")) {
                            pinLength = 250;
                            pinWidth = 2000;
                        } else {
                            if (packType.equals("R1206")) {
                                pinLength = 250;
                                pinWidth = 2050;
                            } else {
                                System.out.println("Wrong Type of Resistor");
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0, localPinRot = 0; i < pins.length; i++, localPinRot += 180) {
            Pin pin = new Pin(i + 1, pinLength, pinWidth, 300, localPinRot);
            pins[i] = pin;
        }
        return pins;

    }
    private static ArrayList<TestMethod> setPinTest(ArrayList<TestMethod> pinTests) {
        Miniscus miniscus = new Miniscus(700);
        pinTests.add(miniscus);
        Solder solder = new Solder(100);
        pinTests.add(solder);
        return pinTests;
    }

}




