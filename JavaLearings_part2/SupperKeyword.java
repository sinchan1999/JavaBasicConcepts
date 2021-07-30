
package coreJava2;

class A 
{
	public A() {
		System.out.println("I am the default constructor of A");
	}
	
	public A(int i) {
		System.out.println("I am the parameterized constructor of A");
	}	
	
	}		


class B extends A 
{
	
	public B() {
		//super();// By default this super(); is persent.
		System.out.println("I am the default constructor of B");
	}
	
	public B(int i) {
		
		super(i); // First calls the A by passing parameter value then calls B.
		System.out.println("I am the parameterized constructor of B");
	}
	
	
}



public class  SupperKeyword {
	public static void main(String args[]) {
		
		B obj= new B(8);		
		
	}

}
