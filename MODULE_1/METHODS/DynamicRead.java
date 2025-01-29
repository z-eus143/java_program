import java.util.Scanner;

public class DynamicRead {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter any int data");
        int i = s.nextInt();
        System.out.println("Int Data : " + i);

        System.out.println("Enter any byte data");
        byte b = s.nextByte();
        System.out.println("Byte Data : " + b);

        System.out.println("Enter any short data");
        short sh = s.nextShort();
        System.out.println("Short Data : " + sh);

        System.out.println("Enter any long data");
        long l = s.nextLong();
        System.out.println("Long Data: " + l);

        System.out.println("Enter any float data");
        float f = s.nextFloat();
        System.out.println("Float Data : " + f);

        System.out.println("Enter any double data");
        double d = s.nextDouble();
        System.out.println("Double Data : " + d);

        s.nextLine();

        System.out.println("Enter any string data");
        String str = s.nextLine();
        System.out.println("String Data : " + str);

        System.out.println("Enter any char data");
        char c = s.nextLine().charAt(0);
        System.out.println("Double Data : " + c);
    }
}