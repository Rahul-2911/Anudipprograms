import java.util.Scanner; //object of the scanner class

public class FindFourLargestNumber

{
      //main function
	public static void main(String[] args)
	{
      int n1,n2,n3,n4,largest;
      Scanner sc=new Scanner(System.in);
       //reading input from the user
      System.out.println("Enter the number 1:");
      n1=sc.nextInt();
      System.out.println("Enter the number 2:");
      n2=sc.nextInt();
      System.out.println("Enter the number 3:");
      n3=sc.nextInt();
      System.out.println("Enter the number 4:");
      n4=sc.nextInt();
      largest=((n1>n2 && n1>n3 && n1>n4)?n1:(n2>n3 && n2>n4)?n2:(n3>n4)?n3:n4);
      System.out.printf("largest among %d %d %d and %d is %d",n1,n2,n3,n4,largest);
	}
}
