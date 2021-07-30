package coreJava2;

class Student
{
	private int rollno;
	private String name;
	
	// GETTERS & SETTERS
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

// Encapsulation->> Binding data with methods!
public class Encapsulation {
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.setRollno(55);
		s1.setName("SINCHAN");
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
	}

}
