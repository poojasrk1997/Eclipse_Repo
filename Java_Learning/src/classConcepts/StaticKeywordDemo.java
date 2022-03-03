package classConcepts;


class Emp
{
	int eid;
	int esal;
	static String ceo;
	
	static{
		ceo="Sham";
		System.out.println("1Static");
	}
	
	public Emp()
	{
		eid=1;
		esal=2000;
		System.out.println("Constructor");
		
	}
	static{
		ceo="Sham";
		System.out.println("2Static");
	}
	
	public void show()
	{
		System.out.println(eid + " : " + esal + ": " +ceo);
	}
	
}

public class StaticKeywordDemo {

	public static void main(String[] args) {
		
		Emp obj1=new Emp();
		Emp obj2=new Emp();
		/*obj1.eid=4;
		obj1.esal=4000;
		Emp.ceo="POOJA";
		
		
		obj2.eid=5;
		obj2.esal=5000;
		Emp.ceo="POOJA";
		
		Emp.ceo="RAHUL";*/
		
		obj1.show();
		obj2.show();
	}

}


