class IfElseStatement
{
	public static void main(String[] args) 
	{
		int age = 40;

		System.out.println("Welcome");

		if (age > 0)
		{
			if(age >= 18)
				System.out.println("Eligible for a DL");
			else
				System.out.println("Not eligible for a DL");
		}
		else
			System.out.println("invalid data...");

		System.out.println("Thank you");


		
	}
}