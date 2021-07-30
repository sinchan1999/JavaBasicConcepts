package coreJava2;

class sum{
	public int add(int ... n) // Using '...' mean elements comes here in the form of array. 
	{                         // Use varargs when no.of parameters are not fixed.
		int sum=0;
		for(int i:n) {
			sum=sum+i;
		}
		return sum;
	}
	
}
public class Varargs {
	public static void main(String args[]) {
		sum obj=new sum();
		System.out.println( "SUM is = "+obj.add(5,10,20,5,45,5,10));
		
	}

}
