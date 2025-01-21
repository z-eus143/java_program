public class LocalVariables1
{
	public static void main(String[] args) 
	{
		int a = 50;
		System.out.println(a);

		{
			int b = 30;
			System.out.println(b);
			System.out.println(a);
		}
		System.out.println(a);
		// System.out.println(b);		
	}
}