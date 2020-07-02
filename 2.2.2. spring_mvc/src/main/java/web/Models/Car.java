package web.Models;

public class Car {
    private String model;
    private String color;
    private int number;

    public Car(String model, String color, int number) {
        this.model = model;
        this.color = color;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setYear(String color) {
        this.color = color;
    }
}
