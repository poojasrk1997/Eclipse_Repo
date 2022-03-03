package classConcepts;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		int i=3;   //primitive datatype
		
		//Integer m=new Integer(5); 
		//System.out.println(m);
		
		Integer n=new Integer(i); //Boxing - Wrapping - Putting value inside the object
		System.out.println(n);
		
		Integer value=i;    //Autoboxing 
		System.out.println(value);
		
		int k =n.intValue();      //Unboxing - Unwrapping - fetching value 
		System.out.println(k);
		
		int p= value;       //AutoUnboxing
		System.out.println(p);
		
		

	}

}
