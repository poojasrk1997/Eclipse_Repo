package ExceptionHandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		
		int a,b,c;
		a=10;
		b=0;
		
		try
		{
			c=a/b;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Main Method Started");
	}

}
