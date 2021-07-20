package coreJava2;

class calculator{
	int num1,num2;
	int add,mul;
	
	public void perform() {
		
		add=num1+num2;
		mul=num1*num2;
	}
	public calculator() { //Initiallizing default values with constructor
		num1=5;
		num2=5;
		System.out.println("I am running with default values");
	}
}

public class ObjectDemo {
	public static void main(String args[]) {
		calculator obj =new calculator();// Here calculator() is the default one.
		//obj.num1=10;
		//obj.num2=20;
		obj.perform();
		System.out.println("Addition : "+obj.add);
		System.out.println("Multiplication : "+obj.mul);
	}
	

}
