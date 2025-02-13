import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number greater then zero");
        int n = s.nextInt();
        for (int i = 1; i <= n/2; i++) {
            if (i * i == n) {
                System.out.println("It's a perfect square and square root is " + i);
                break;
            } else if(i == n/2){
                System.out.println("It's not a perfect square");
            }
        }
    }
}
