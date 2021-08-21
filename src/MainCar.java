public class MainCar {
    public static void main(String[] args) {
        Cars.filterCarsByBrand("Lexus");
        Cars.filterCarsByModelAndUsingYears("Camry", 1);
        Cars.filterCarsByYearOfProductionAndPrice(2003, 500);
    }
}
