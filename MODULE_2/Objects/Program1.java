public class Program1 {

    String title;
    String auther;
    int price;

    public static void main(String[] args) {
        Program1 b = new Program1();
        b.title = "IKIGAI";
        b.auther = "HECTOR GARCIA";
        b.price = 375;
        System.out.println("Title : " + b.title);
        System.out.println("Auther : " + b.auther);
        System.out.println("Price : " + b.price); 
    }
}