package coreJava2;

class ConsOver{
	
	int num1,num2;
	String name;
	
	public ConsOver() {
		num1=0;
		num2=0;
		name="Default";
		System.out.println(num1+"\n"+num2+"\n"+name);
		
	}
	
	public ConsOver(int i) {
		num1=i;
		num2=0;
		name=" ";
		System.out.println(num1+"\n"+num2+"\n"+name);
				
	}
	
	public  ConsOver(int i,int j) { 
		num1=i;
		num2=j;
		name=" ";
		System.out.println(num1+"\n"+num2+"\n"+name);
	}	
	
	public  ConsOver(int i,int j, String nm) { 
		num1=i;
		num2=j;
		name=nm;
		System.out.println(num1+"\n"+num2+"\n"+name);
	}	
	
}

public class ConstructorOverloading {
	public static void main(String args[]) {
		
		//ConsOver obj =new ConsOver();
		ConsOver obj =new ConsOver(55,47,"SINCHAN");
		
		
		
	}
	

}
