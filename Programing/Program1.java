import java.util.Scanner;
public class Program1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a valid number.");
        int n = s.nextInt();
        if(n>0){
            table(n);
        } else {
            System.out.println("Enter number greater then zero.");
        }
    }
    public static void table(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}