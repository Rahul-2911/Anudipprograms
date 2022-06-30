
import java.util.Scanner;
public class ArraySearchElement {

	public static void main(String[] args) {
	 int[] num= {10,20,30,40,50};
	 int a;
	 boolean b =false;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elements you want to find:");
		a=sc.nextInt();
		for(int n:num)
		{
			if(n==a)
			{
				b=true;
				break;
			}
		}
		if (b)
			System.out.println(a +" is found.");
	else
		System.out.println(a +" is not found.");
	}

}
