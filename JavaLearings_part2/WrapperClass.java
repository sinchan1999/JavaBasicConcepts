package coreJava2;

public class WrapperClass {
	public static void main (String args[])
	{
		int i =5;
		// Integer num= new Integer(i);
		
		Integer num=Integer.valueOf(i); //Boxing or Wrapping.
		int j=num.intValue(); // unboxing or unwrapping.
		
	}

}
