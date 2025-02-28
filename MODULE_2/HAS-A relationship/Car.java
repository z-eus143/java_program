
public class Car {
    private String brand;
    private String model;
    private int price;
    private Tyre[] tyres = new Tyre[4];
    private int counter;
    Engine engine;

    //constructor

    public Car(){

    }

    public Car(String brand, String model, int price, double cc, double hp, String fueltype) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        engine = new Engine(cc, hp, fueltype);
    }

    // getter
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getCounter() {
        return counter;
    }

    // setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // helper method
    public void createTyre(int aspratiop, String brand, double inch, String type, double tyremm){
        if(counter < tyres.length)
            tyres[counter++] = new Tyre(aspratiop, brand, inch, type, tyremm);
        else
            System.out.println("All Tyres Are Present");
    }

    // display method
    public void displayCar(){
        System.out.println("--------CAR DETAILS -------");
        System.out.println("BRAND : " + getBrand());
        System.out.println("MODEL : " + getModel());
        System.out.println("PRICE : " + getPrice());
        System.out.println("------------------------------------");
        System.out.println("--------ENGINE DETAILS -------");
        engine.displayEngine();
        System.out.println("------------------------------------");
            for (int i = 0;i<tyres.length;i++){
                System.out.println("--------TYRE : "+ (i+1) +" DETAILS -------");
                tyres[i].displayTyre();
                System.out.println("------------------------------------");
            }
    }

}
