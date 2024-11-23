package HomeWork21;

public class Component {
    private String brand;
    private String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Component() { // Если не использовать пустой конструктор - то можно brand + model сделать final
        // соответственно убрав setter. Но придется в конструкторе Компьютера ручками указывать
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

}
