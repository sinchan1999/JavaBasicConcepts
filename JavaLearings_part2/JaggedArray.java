package coreJava2;

public class JaggedArray {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8};
		int c[]= {3,5};
		int d[][]= {
				{1,2,3,4,5},  // JaggedArray, where no.of columns are not fixed. 
				{6,7,8},
				{3,5}    };
		
		for (int i=0;i<d.length;i++) {         
			for(int j=0; j<d[i].length; j++) {
				System.out.print(" "+d[i][j]);
				
			}
			System.out.println();
		}	
		
	}

}
