
import java.util.Scanner;
public class SumOfSeries1 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int number;
		double sum=0;
		System.out.println("enter number of terms of series : ");
		number=scanner.nextInt();
		for(int i=1;i<=number;i++)
		{
			sum=sum +1.0/i;
		}
		System.out.println("sum "+ sum);
}
}