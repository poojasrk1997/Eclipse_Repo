package classConcepts;


abstract class M{
	public abstract void config();
	 
	public void show()
	{
		
	}
	
}

class D extends M
{
	public void show()
	{
		System.out.println("extends M class");
	}
	public void config()
	{
		System.out.println("extends M class");
	}
	
	
}

class R extends M
{
	public void config()
	{
		System.out.println("extends M class again");
	}

}


public class AbstractDemo {

	public static void main(String[] args) {
		M a=new D();
		a.show();
		a=new R();
		a.config();

	}

}
