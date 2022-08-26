/*
 * author rahul prasad
 */

import java.util.Scanner;

interface LibraryUser
{
	void registerAccount();
	void requestBook();
}
class kidUser implements LibraryUser
{
	int age;
	String bookType;
	public void registerAccount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		age = sc.nextInt();
		
		if(age<12)
		{
			System.out.println("You have successfully registered under a kid account");
		}
			
		
		else {
			System.out.println("Sorry age must be less than 12 to register as a kid");
			
		}
	}
    public void requestBook() 
    {
    	if(age<12) {
    	Scanner sc1 = new Scanner(System.in);
  
    	System.out.println("Books Available Kids books and Fictions books");
  	 bookType = sc1.nextLine();
    	
    	switch (bookType) {
    	case "kids":
    		System.out.println("Book Issued Successfully, please return the book within 10 days");
    		break;
    	case "fictions":
    		System.out.println("Oops, you are allowed to take only kids book");
    		break;
    		default :
    			System.out.println("Enter valid book name");
    		
    	}	
    }
    
    }
}
class AdultUser implements LibraryUser
{
	int age;
	String bookType;	
	public void registerAccount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		age = sc.nextInt();
		
		if(age>12)
		{
			System.out.println("You have successfully registered under an adult account");
		}
		else {
			System.out.println("Sorry age must be greater than 12 to register an adult account");
		}
	}
    public void requestBook() 
    {
    	if(age>12) {
    	Scanner sc1 = new Scanner(System.in);
  
    	System.out.println("Books Available Kids books and Fictions books");
    	 bookType = sc1.nextLine();
 
    	switch (bookType) {
    	case "kids":
    		System.out.println("Oops, you are allowed to take only adult fiction book");
    		break;
    	case "fictions":
    		System.out.println("Book Issued Successfully, please return the book within 07 days");
    		break;
    		default :
    			System.out.println("Enter valid book name");
    	}
    	}	
    }
    
}
     public class LibraryInterfaceDemo
     {
    	 public static void main(String[] args) {
			
    	 kidUser u = new kidUser();
    	 u.registerAccount();
    	 u.requestBook();
    	 
    	 AdultUser a1 = new AdultUser();
    	 a1.registerAccount();
    	 a1.requestBook();
    	 
    	 }
     }

