
package coreJava2;

public class EnhancedForLoop {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5};
		
		System.out.print("Array a[] is :");
		for(int k:a) {
			System.out.print(k+" "); //Printing a[] using enhanced for loop.
		}
		System.out.println();
		
		
		int b[]= {6,7,8};
		int c[]= {3,5};
		int d[][]= {
				{1,2,3,4,5},   
				{6,7,8},
				{3,5}    };
		System.out.print("Array d[][] is :"+"\n");
		
		for(int k[]:d) {  // Array k[] is fetching the values for each row. 
			for(int l:k) {// l is taking each element from k[].
				System.out.print(+l+" ");
			}
			System.out.println();
		}
		
		
	}

}
