package arrayProg;

import java.util.Arrays;

public class SecLargestElem {
		
		public static int getSecondLargest(int[] a, int size){  
			
			Arrays.sort(a); //Sorted in Ascending in order
			
			return a[size-2];  
			
			}  
			public static void main(String args[]){  
				
			int a[]={17,22,55,16,3,2};  
			
			System.out.println("Second Largest: "+getSecondLargest(a,a.length));  
			
			}
		
		

	}


