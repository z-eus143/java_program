public class Radian{
    public static void main(String[] args) {
        radianToDegree(1);
    }

    public static void radianToDegree(double radian){
        double a = 22;
        double b = 7;
        double pi = (a/b);
        double degree = radian*(180/pi);
        double minute = ((degree - (int)degree)*60)*60;
        System.out.println((int)degree + " Degree " + minute + " Seconds ");

    }
}
