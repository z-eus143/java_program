public class Engine {
    private double cc;
    private double hp;
    private String fueltype;

    // constructor
    public Engine() {
    }
    public Engine(double cc, double hp, String fueltype) {
        setCc(cc);
        setHp(hp);
        setFueltype(fueltype);
    }

    // getters
    public double getCc() {
        return cc;
    }

    public double getHp() {
        return hp;
    }

    public String getFueltype() {
        return fueltype;
    }

    // setters
    public void setCc(double cc) {
        this.cc = cc;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }
    
    // display method
    public void displayEngine(){
        System.out.println("CC : " + getCc());
        System.out.println("HP : " + getHp());
        System.out.println("FUELTYPE : " + getFueltype());
    }
}
