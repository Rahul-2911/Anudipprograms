
import java.util.Scanner;
public class ProductOfArrayOfElements
{
   public static void main(String[] args) 
	{
	   int a[], num,prod=1;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the required size of array:");
	   num=sc.nextInt();
	   a = new int[num];
	   System.out.println("enter the elements of array:");
       for(int i=0 ; i<num ; i++ )
       {
    	   System.out.println("enter the " +(i+1)+ " elements:");
       
    	   a[i] = sc.nextInt();
       }
       for(int i=0 ; i<num ; i++)
       {
       prod = prod*a[i];
	}
     System.out.println("the product of array elements is "+prod);
}
}
