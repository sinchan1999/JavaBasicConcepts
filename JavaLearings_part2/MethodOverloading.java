package coreJava2;

class add{
		
	
	public void sum(int num1, int num2) {
		System.out.println(num1+num2);		
	}
	
	public void sum(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);		
	}
	
	public void sum(float num1, float num2) { 
		System.out.println(num1+num2);
	}	
	
	public void sum(double num1, double num2) { 
		System.out.println(num1+num2);
	}	
	
}

public class MethodOverloading {
	public static void main(String args[]) {
		
		add obj =new add();			
		obj.sum(50, 20);
		obj.sum(10, 20, 30);
		obj.sum(10.22, 20.66);
		obj.sum(6.22, 20.66);
		
		
	}
	

}
