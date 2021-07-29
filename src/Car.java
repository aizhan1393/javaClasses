import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Calendar;

public class Car {
    public int id;
    public String brand;
    public String model;
    public int yearOfProduction;
    public String colour;
    public int price;
    public int registerNumber;

    public Car(int id, String brand, String model, int yearOfProduction, String colour, int price, int registerNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
        this.price = price;
        this.registerNumber = registerNumber;
        }

    public Car(int id, int yearOfProduction, int registerNumber) {
        this.id = id;
        this.yearOfProduction = yearOfProduction;
        this.registerNumber = registerNumber;
    }

    public Car(int id, String model, int yearOfProduction, int registerNumber) {
        this.id = id;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.registerNumber = registerNumber;
    }

    public Car(int id, String brand, int yearOfProduction, int price, int registerNumber) {
        this.id = id;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.registerNumber = registerNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", registerNumber=" + registerNumber +
                '}';
    }


}
