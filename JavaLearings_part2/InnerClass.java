package coreJava2;

class Outer
{
	
	public void show() {
		System.out.println("I am the OuterClass.");
	}
	
	class Inner // This a member class
	{
		public void show() {
			System.out.println("I am the InnerClass. I am a member class");	
	 }
	}
		static class Inner2 // This is a static class
	{
			public void show() {
				System.out.println("I am the Inner2 Class. I am a Static class");	
		}
	}	
	
}
	


public class InnerClass{
	public static void main(String args[]) {
		Outer obj=new Outer(); // Creating an obj of Outer Class.
		obj.show();
		
		Outer.Inner obj2 =obj.new Inner(); // Calling a member class by creating an obj of Outer Class.
		obj2.show();
		
		Outer.Inner2 obj3 =new Outer.Inner2(); // Calling a static class
		obj3.show();
	}
	

}
