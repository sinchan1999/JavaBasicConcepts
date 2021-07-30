package coreJava2;

class calculator3 //Super,Parent,Base
{
	
	public int add (int ... n) {
		int sum=0;
		for (int i:n) {
			sum=sum+i;
		}
		return sum;		
	}
	
	public int mul (int ... n) {
		int mul=1;
		for (int i:n) {
			mul=mul*i;
		}
		return mul;		
	}
}

class calAdv extends calculator3 //Sub,Child,Derived
{
	
	public double div (double num1, double num2) {
		double div;		
			div=num1/num2;		
		return div;		
	}
	
	
}



class calAdv2 extends calAdv // This is an example of multi-level Inheritance.
{
	
	public double power (int num1, int num2) {
		double power;		
			power=Math.pow(num1, num2);		
		return power;		
	}
	
	
}

public class Inheritance {
	public static void main(String args[]) {
		
		calAdv2 obj= new calAdv2();
		System.out.println(obj.add(34,17));
		System.out.println(obj.mul(34,17));
		System.out.println(obj.div(34,17));
		System.out.println(obj.power(25,2));
		
	}

}
