package classConcepts;


class student
{
	private int sno;
	private String sname;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		student s = new student();
		s.setSno(8);
		s.setSname("pooja");
		System.out.println(s.getSname());
		System.out.println(s.getSno());

	}

}
