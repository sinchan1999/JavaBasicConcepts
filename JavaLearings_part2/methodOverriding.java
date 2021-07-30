package coreJava2;

class A1{
	public void show() {
		System.out.println("I am the Super Class !");
	}
	
}

class B2 extends A1{
	
	@Override
	public void show() {
	//	super.show(); >> To display the Super Class also.
		System.out.println("I am Sub Class !");
	}
	
}


public class methodOverriding {
	public static void main(String args[]) {
		
		B2 obj = new B2();
		obj.show();		
	}	
	
}
