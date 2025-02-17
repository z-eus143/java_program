import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String str = s.nextLine();
        str = reverse(str,str.length());
        System.out.println(str);
    }
    public static String reverse(String str,int index){
        StringBuilder sb = new StringBuilder(str);
        for (int i = sb.length() - 1; i >=0 ; i --){
            sb.append(sb.charAt(i));
        }
        sb.delete(0, index);
        return sb.toString();
    }
}
