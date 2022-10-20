package web.models;

import java.util.Objects;

public class Car {
    private String model = "default web.model";
    private String manufacturer = "default manufacturer";
    private int price = 0;

    public Car() {

    }
    public Car(String model, String manufacturer, int price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return price == car.price && model.equals(car.model) && manufacturer.equals(car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer, price);
    }

    @Override
    public String toString() {
        return "Машина: " +
                "Модель - " + model +
                ", Страна производства - " + manufacturer +
                ", Цена - " + price +
                " $";
    }
}
