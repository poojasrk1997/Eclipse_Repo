package JavaConcepts;

public class staticStudent {

	static String clg = "LPU";
	int rollno;
	String name;

	public staticStudent(int r, String n) {
		rollno = r;
		name = n;

	}

	void display() {
		System.out.println(clg + " " + rollno + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticStudent s1 = new staticStudent(1, "Pooja");

		staticStudent s2 = new staticStudent(2, "Saurav");
		s1.display();
		s2.display();
	}

}
