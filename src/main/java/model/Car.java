package model;

public class Car {
    private String manufacturer;
    private String model;
    private CarColor color;

    private Car(String manufacturer, String model, CarColor color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
    }

    public static Car addCar(String manufacturer, String model, CarColor color){
        return new Car(manufacturer, model, color);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }
}
