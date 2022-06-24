public class PrimeNumberCheck1
{
	public static void main(String[] args)
	{

		  int Number=3;
		  int n = 2;
		  int Count = 0;
		  while (n <= Number / 2)
		  {
		   if (Number % n == 0) 
		   {
		    Count++;
		    break;
		   }
		   n++;
		  }
		  if (Count == 0 ) {
		   System.out.print(Number + " is a prime number ");
		  } else {
		   System.out.print(Number + " is not a prime number ");
		  }
	}
}