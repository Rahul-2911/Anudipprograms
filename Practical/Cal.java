
import java.util.Scanner;
public class Cal
{
 public static void main(String[] args)
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter num1 : ");
	double num1 = sc.nextDouble();
	System.out.println("enter num2 : ");
	double num2 = sc.nextDouble();
	System.out.println("enter numbers(1,2,3,4)");
	char numbers = sc.next().charAt(0);
	
	double result;
	switch (numbers)
	{
	case '1' : 
		result = num1+num2;
		System.out.printf("the result is: "+num1+"+"+num2+"="+result);
		break;
	case '2' :
		result = num1-num2;
		System.out.printf("the result is: "+num1+"-"+num2+"="+result);
		break;
	case '3' :
		result = num1*num2;
		System.out.printf("the result is: "+num1+"*"+num2+"="+result);
		break;
	case '4' :
		System.out.println("quit");
	    break;
	default:
		System.out.println("sorry! you entered incorrect number");
	return;
 }
}
}
