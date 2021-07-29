import java.util.ArrayList;
import java.util.Calendar;

public class MainCar {

    public static void printCarList(Car[] array, String brand){
        ArrayList<Car> resultingList = new ArrayList<>();
        for(Car car: array){
            if(car.getBrand().equals(brand))
                resultingList.add(car);
        }
        System.out.println(resultingList);
    }

    public static void printCarList(Car[] array, String model, int usingYears){
        ArrayList<Car> resultingList = new ArrayList<>();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        for(Car car: array){
            if(car.getModel().equals(model) && (currentYear - car.getYearOfProduction()) > usingYears)
                resultingList.add(car);
        }
        System.out.println(resultingList);
    }


    public static void printCarList(Car[] array, int yearOfProduction, int price){
        ArrayList<Car> resultingList = new ArrayList<>();
        for(Car car: array){
            if(car.getYearOfProduction() == yearOfProduction && car.getPrice() > price)
                resultingList.add(car);
        }
        System.out.println(resultingList);
    }
    public static void main(String[] args) {
        Car[] array = new Car[5];
        array[0] = new Car(108, "Toyota", "Camry", 2018, "black", 5000, 101012);
        array[1] = new Car(100, "Lexus", "RX", 2010, "black", 4000, 101009);
        array[2] = new Car(111, "Toyota", "Rav4", 2020, "white", 8000, 101011);
        array[3] = new Car(101, "Lexus", "GS", 2000, "black", 2000, 101008);
        array[4] = new Car(110, "Lada", "Granta", 2003, "blue", 1000, 101000);

        printCarList(array, "Lexus");
        printCarList(array, "Camry", 1);
        printCarList(array, 2003, 500);
    }
}
