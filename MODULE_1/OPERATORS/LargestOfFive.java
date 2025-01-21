public class LargestOfFive
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 5;
		int c = -99;
		int d = 0;
		int e = 66666;

		int largest = (a>b && a>c && a>d && a>e) ? (a) :
					  		 (b>c && b>d && b>e) ? (b) :
					  		 		(c>d && c>e) ? (c) :
					  		 			   (d>e) ? (d) : (e);


		System.out.println("Largest of five numbers is: " + largest);

		
	}

}