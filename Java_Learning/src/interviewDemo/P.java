package interviewDemo;

class A {
	void display() {
		System.out.println("inside A");
	}
}

class B extends A {

	void display() {
		System.out.println("inside B");
	}
}


class P {
	public static void main(String[] args) {
		A p1 = new A();
		p1.display();

	}
	
	void display() {
		System.out.println("inside P");
	}
}
