
class Stud
{
	int id;
	String name,course;
	
	public Stud(int i ,String n, String c) 
	{
		id=i;
		name=n;
		course=c;
	}
		void display()
		{
			System.out.println("my id is :"+id);
			System.out.println("my name is :"+name);
			System.out.println("my course is :"+course);
		}

	public static void main(String[] args)
	{
		Stud sc1= new Stud(15 , "rahul", "java");
		Stud sc2 = new Stud(18 , "vijay", "python");
		Stud sc3 = new Stud(16 , "dheeraj", "web dovelopment");
		
          sc1.display();
          sc2.display();
          sc3.display();
	}

}