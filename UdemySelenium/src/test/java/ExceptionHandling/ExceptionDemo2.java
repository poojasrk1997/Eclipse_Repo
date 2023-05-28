package ExceptionHandling;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		String str=null;
		
		
		try
		{
		System.out.println(str.toUpperCase());
		}
		catch(NullPointerException e)
		{
			System.out.println("exception handled");
		}
	}

}
