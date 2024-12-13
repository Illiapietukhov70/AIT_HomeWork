package HomeWork27;

public enum Seasons {
    WINTER("Зима", 1,3.33),
    SPRING("Весна", 2, 12.24),
    SUMMER("Лето", 3, 20.23),
    AUTUMN("Осень", 4, 10.43);

    private String russName;
    private int numberSeasons;
    private double middleTemp;
    public String returnMiddleTemp () {
        return String.format("Средняя температура за сезон %s: %.2f c", this.russName, this.middleTemp);
    }

    Seasons(String russName, int numberSeasons, double middleTemp
    ) {
        this.russName = russName;
        this.numberSeasons = numberSeasons;
        this.middleTemp = middleTemp;
    }

    public String getRussName() {
        return russName;
    }

    public int getNumberSeasons() {
        return numberSeasons;
    }

    public double getMiddleTemp() {
        return middleTemp;
    }
}
