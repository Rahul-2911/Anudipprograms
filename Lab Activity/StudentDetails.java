
class Student {
	private int id;
	private String name, course;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setId(int i) {
		id = i;
	}

	public int getId() {
		return id;
	}

	public void setCourse(String c) {
		course = c;
	}

	public String getCourse() {
		return course;
	}
}

public class StudentDetails
{

	public static void main(String[] args)
	{
		Student st = new Student();
		st.setName("rahul");
		
		System.out.println(st.getName());
		st.setId(18);
		
		System.out.println(st.getId());
		st.setCourse("Java");
		
		System.out.println(st.getCourse());
		st.setName("vijay");
		System.out.println(st.getName());
		st.setId(47);
		System.out.println(st.getId());
		st.setCourse("python");
		System.out.println(st.getCourse());

	}


}
