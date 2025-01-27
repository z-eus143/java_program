public class Circle {
    public static void main(String[] args) {

        double radius = 5;
        circumference(radius);

        System.out.println("Radius = " + radius + " Circumference = " + circumference(radius) + "Area = " + area(radius));
        
    }
    public static double circumference(double r) {
        double result = ( 2 * 3.14159 ) * r;
        return result;
    }
    public static double area(double r) {
        double result = 3.14159 * ( r * r );
        return result;
    }
}
