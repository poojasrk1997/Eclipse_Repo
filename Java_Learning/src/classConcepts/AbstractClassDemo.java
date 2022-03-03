package classConcepts;



 abstract class cal
{
	public abstract void calculate(Number i);
	
	
}
class exe extends cal
{
	public void calculate(Number i)
	{
		System.out.println(i);
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		cal c=new exe();
		c.calculate(7.8);
		

	}

}
