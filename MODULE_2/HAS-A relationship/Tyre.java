public class Tyre {
    private String brand;
    private String type;
    private double tyremm;
    private int aspratiop;
    private double inch;

    // constructor
    public Tyre(){

    }
    public Tyre(int aspratiop, String brand, double inch, String type, double tyremm) {
        setAspratiop(aspratiop);
        setBrand(brand);
        setInch(inch);
        setType(type);
        setTyremm(tyremm);
    }

    // getter

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getTyremm() {
        return tyremm;
    }

    public int getAspratiop() {
        return aspratiop;
    }

    public double getInch() {
        return inch;
    }

    // setter

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTyremm(double tyremm) {
        this.tyremm = tyremm;
    }

    public void setAspratiop(int aspratiop) {
        this.aspratiop = aspratiop;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    // display method
    public void displayTyre(){
        System.out.println("BRAND : " + getBrand());
        System.out.println("TYPE : " + getType());
        System.out.println("TYRE MM : " + getTyremm());
        System.out.println("TYRE ASP. RATIO : " + getAspratiop());
        System.out.println("TYRE RIM INCH : " + getInch());
    }

}
