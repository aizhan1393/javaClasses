import java.util.ArrayList;
import java.util.Calendar;


public class Cars {
    public static Car[] cars;
    static{
        cars = new Car[]{
                new Car(108, "Toyota", "Camry", 2018, "black", 5000, 101012),
                new Car(100, "Lexus", "RX", 2010, "black", 4000, 101009),
                new Car(111, "Toyota", "Rav4", 2020, "white", 8000, 101011),
                new Car(101, "Lexus", "GS", 2000, "black", 2000, 101008),
                new Car(110, "Lada", "Granta", 2003, "blue", 1000, 101000),
        };
    }

    public static void filterCarsByBrand(String brand){
        ArrayList<Car> resultingList = new ArrayList<>();
        for(Car car: cars){
            if(car.getBrand().equals(brand))
                resultingList.add(car);
        }
        System.out.println(resultingList);
    }

    public static void filterCarsByModelAndUsingYears(String model, int usingYears){
        ArrayList<Car> resultingList = new ArrayList<>();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        for(Car car: cars){
            if(car.getModel().equals(model) && (currentYear - car.getYearOfProduction()) > usingYears)
                resultingList.add(car);
        }
        System.out.println(resultingList);
    }

    public static void filterCarsByYearOfProductionAndPrice(int yearOfProduction, int price){
        ArrayList<Car> resultingList = new ArrayList<>();
        for(Car car: cars){
            if(car.getYearOfProduction() == yearOfProduction && car.getPrice() > price)
                resultingList.add(car);
        }
        System.out.println(resultingList);
    }
}
