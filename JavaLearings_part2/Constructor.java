package coreJava2;

class cal{
	int num1,num2; 
	double num3,num4;
	int add,mul;
	
	public void perform() {
		
		add=num1+num2;
		mul=num1*num2;
	}
	public cal(int x, int y) { //Initiallizing default values with constructor
		num1=x;
		num2=y;
		System.out.println("I am running with 'int' values");
	}
	public cal(double z) { //Initiallizing default values with constructor
		num1=(int)z ;
		num2=(int)z;
		System.out.println("U gave me double values but I will return in int values");
	}
	
	
}

public class Constructor {
	public static void main(String args[]) {
		//cal obj =new cal(50,50);// Signature of paramerters should be matched.
		cal obj =new cal(8.22);
		
		
		obj.perform();
		System.out.println("Addition : "+obj.add);
		System.out.println("Multiplication : "+obj.mul);
	}
	

}
