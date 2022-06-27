import java.util.Scanner;
public class ArrayExample3 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Elements You Want To Store? ");
		int m;
		m = sc.nextInt();
		int arr[] = new int[m];
		System.out.println("Enter the values");
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
			
		}
			for(int a: arr)
			{
				System.out.println(a);
				
			}
	}

	}


