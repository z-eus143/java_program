import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String str = s.next();
s.close();
        System.out.println(reverse(str, str.length()-1));
    }
    public static String reverse(String str,int index) {
        if (index == 0) {
           return str.charAt(0) + "";
        } else {
           return str.charAt(index) + reverse(str, index-1);
        }
    }
}
