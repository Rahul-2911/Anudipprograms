
import java.util.Scanner;
public class CalcUsingDoWhileLoop
{

	public static void main(String[] args) 
	{
		float num1,num2,result;
		char choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("main menu :");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Exit");
			System.out.println("Enter your choice :");
			choice = sc.next().charAt(0);
			
			switch(choice)
			{
			case '1' : 
				System.out.println("Enter first number :");
				num1=sc.nextFloat();
				System.out.println("Enter second number :");
				num2=sc.nextFloat();
				result = num1+num2;
				System.out.printf("the result is: "+num1+"+"+num2+"="+result);
				break;
			case '2' :
				System.out.println("Enter first number :");
				num1=sc.nextFloat();
				System.out.println("Enter second number :");
				num2=sc.nextFloat();
				result = num1-num2;
				System.out.printf("the result is: "+num1+"-"+num2+"="+result);
				break;
			case '3' :
				System.out.println("Enter first number :");
				num1=sc.nextFloat();
				System.out.println("Enter second number :");
				num2=sc.nextFloat();
				result = num1*num2;
				System.out.printf("the result is: "+num1+"*"+num2+"="+result);
				break;
			case '4' :
				System.out.println("Enter first number :");
				num1=sc.nextFloat();
				System.out.println("Enter second number :");
				num2=sc.nextFloat();
				System.out.println("quit");
			    break;
			default:
				System.out.println("sorry! you entered incorrect number");
			return;
		}
		}
		while(choice!=4);
	}

}
