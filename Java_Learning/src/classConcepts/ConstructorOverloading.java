package classConcepts;

public class ConstructorOverloading {
	
	int j,k;
	
	public ConstructorOverloading() {
		
		System.out.println("Hello World");
		
	}
	public ConstructorOverloading(int i) {
		System.out.println(i);
		
	}
	public ConstructorOverloading(int k, int j) {
		 System.out.println(k+j);
		

	}
		

	public static void main(String[] args) {
		
		ConstructorOverloading obj=new ConstructorOverloading();
		ConstructorOverloading obj1=new ConstructorOverloading(8);
		ConstructorOverloading obj2=new ConstructorOverloading(4,6);
	
		
	
	

	}

}
