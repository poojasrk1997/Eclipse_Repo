package revision;

public class Variable {

	static int num=9;
	
	// local variable
	public void show() {
		int i = 5;
		System.out.println(i);
	}

	public void display() {
		int i = 6;
		System.out.println(i);
	}

	// Parameter variable
	public void add(int i) {
		int j = 8;
		System.out.println(j);
	}

	

	public static void main(String[] args) {

		Variable obj = new Variable();
		System.out.println(Variable.num);
		System.out.println(obj.num);
		System.out.println(num);
		
		//obj.show();
		//obj.display();
		//obj.add();
		
		
		

	}

}
