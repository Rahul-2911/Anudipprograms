import java.util.Scanner;

public class VowelsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isVowel=false; ;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character : ");
char ch=sc.next().charAt(0);
switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U': isVowel=true;
}
if(isVowel ==true)
{
	System.out.println(ch+" is a vowel");
}
else
{
	System.out.println(ch+" is not a vowel");
}
}
}
