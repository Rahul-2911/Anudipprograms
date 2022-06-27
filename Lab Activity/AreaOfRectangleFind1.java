
import java.util.Scanner;
public class AreaOfRectangleFind1
{
public static void main(String[] args)
	{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of rectangle:");
	double length=sc.nextDouble();
	System.out.println("Enter the width of rectangle:");
	double width=sc.nextDouble();
	  double area = width*length;
	System.out.println("Enter area of rectangle = " + area);
		}

}
