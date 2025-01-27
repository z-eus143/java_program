public class Cylinder {
    public static void main(String[] args) {
        double radius = 5;
        double height = 10;
        System.out.println("Radius and Height of Cylinder : " + radius +" ," + height);
        System.out.println("Curved Surface Area = " + csa(radius, height));
        System.out.println("Total Surface Area = " + tsa(radius, height));
        System.out.println("Volume = " + volume(radius, height));
    }
    public static double csa(double r, double h){
        double result = (2*3.14159)*(r*h);
        return result;
    }
    public static double tsa(double r, double h){
        double result = ((2*3.14159)*r)*(h+r);
        return result;
    }
    public static double volume(double r, double h){
        double result = (3.14159*(r*r))*h;
        return result;
    }
}