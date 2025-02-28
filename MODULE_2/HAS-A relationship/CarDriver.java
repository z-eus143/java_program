public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car("nissan", "gtr skyline", 40000000, 8000, 600, "petrol");
        c1.createTyre(75, "appolo", 16, "tybeless", 215);
        c1.createTyre(75, "appolo", 16, "tybeless", 215);
        c1.createTyre(75, "appolo", 16, "tybeless", 215);
        c1.createTyre(75, "appolo", 16, "tybeless", 215);
        c1.displayCar();
    }
}
