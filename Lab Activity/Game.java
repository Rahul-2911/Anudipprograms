/*
author rahul prasad
*/
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args)
	{
		int count,usercount=0,comcount=0,drawcount=0;
		for(count=0;count<5;count++)
		{
			System.out.println("Enter your choice:\n1.Stone\n2.Paper\n3.Scissor");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		if(user == 1)
			System.out.println("user choose Stone");
		else if(user == 2)
			System.out.println("user choose Paper");
		else if(user == 3)
			System.out.println("user choose Scissor");
		else 
			System.out.println("wrong input");
		
        Random ran = new Random();
        int computer = ran.nextInt(3);
        
        if (computer == 0)
        	System.out.println("computer choose stone");
		else if(computer == 1)
			System.out.println("computer choose Paper");
		else if(computer == 2)
			System.out.println("computer choose Scissor");
		else 
			System.out.println("wrong input");
        if (user == 1 && computer == 0 || user == 2 && computer == 1 || user == 3 && computer == 2)
        {
        System.out.println("Match Draw\n");
          drawcount ++;
         
        }
        else if (user == 1 && computer == 2 || user == 2 && computer == 0 || user == 3 && computer == 1)
        {
        System.out.println("YOU WIN!\n");
          usercount ++;
          }
        else if (user == 1 && computer == 1 || user == 2 && computer == 2 || user == 3 && computer == 0)
        {
        	System.out.println("COMPUTER WIN!\n");
            comcount ++;
		}
		}
		System.out.println("YOU WIN! "+ usercount +" TIMES");
		System.out.println("COMPUTER WIN! "+ comcount +" TIMES");
		System.out.println("MATCH DRAW "+ drawcount +" TIMES");
		
	}
	 
	}



