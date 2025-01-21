public class PostIncrement
{
	public static void main(String[] args) 
	{
		//CASE-1
		System.out.println("CASE-1:");
		int a = 10;
		a++;
		System.out.println(a);

		//CASE-2
		System.out.println("CASE-2:");
		int b = 20;
		System.out.println(b++);
		System.out.println(b);

		//CASE-3
		System.out.println("CASE-3:");
		int c = 30;
		c = c++;
		System.out.println(c);
		System.out.println(c);

		//CASE-4
		System.out.println("CASE-4:");
		int d = 40;
		int e = d++;
		System.out.println(d);
		System.out.println(e);



		
	}
}