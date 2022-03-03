package classConcepts;

public class MethodOverloading {
	
	
	public void add() {
		
		System.out.println("Hello");
		
	}
	public void add(int i) {
		
		System.out.println(i);
		
	}
	public void add(int i, int j) {
		
		int k=i+j;
		System.out.println(k);
		
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.add();
		obj.add(6);
		obj.add(5, 4);
		
		

	}

}
