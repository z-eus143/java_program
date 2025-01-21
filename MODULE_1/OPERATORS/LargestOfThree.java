public class LargestOfThree
{
	public static void main(String[] args) 
	{
		int a = 100;
		int b = 3000;
		int c = 5;

		// OPTION-1
		// int temp = a > b ? a : b;
		// int largest = temp > c ? temp : c;

		// OPTION-2
		// int largest = a>b ? a>c ? a :  c : b>c ? b : c;

		// OPTION-3
		int largest = a>b && a>c ?  a   :   b>c ? b : c  ; 

		System.out.println("Largest Number : " + largest);
		
	}
}