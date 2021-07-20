package coreJava2;

class cal2{
	int num1,num2; 
	double num3,num4;
	int add,mul;
	
	public void perform() {
		
		add=num1+num2;
		mul=num1*num2;
	}
	public cal2(int num1, int num2) { 
		this.num1=num1;
		this.num2=num2;
		System.out.println("By using this keyword we specify or differentiate between the instance and local variable.");
		System.out.println("this indicates the instance variable");
	}	
	
}

public class ThisKeyword {
	public static void main(String args[]) {
		
		cal2 obj =new cal2(50,50);		
		
		obj.perform();
		System.out.println("Addition : "+obj.add);
		System.out.println("Multiplication : "+obj.mul);
	}
	

}
