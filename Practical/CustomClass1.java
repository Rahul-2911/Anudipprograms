
class Employee
{
int id;
String name;
public void printDetails()
{
	System.out.println("my id is "+id);
	System.out.println("and my name is "+name);
}
}
public class CustomClass1
{
public static void main(String[] args)
{
	Employee rahul = new Employee();
	Employee amit = new Employee();
	rahul.id = 4;
	rahul.name = "rahul prasad";
	amit.id = 12;
	amit.name = "amit rajbhar";
	rahul.printDetails();;
	amit.printDetails();

	}
	

}
