package interviewDemo;

public class OccuranceOfChar {
	
	public static void main(String[] args) {
	
	String stringName = "POOJAKHARATMOL";
	int count =0;
	
	for(int i=0; i<stringName.length(); i++)
	{
		String c=String.valueOf(stringName.charAt(i));
		
		if(c.equals("O"))
		{
			count++;
		}
		
	}
	
	System.out.println("String occurance count for O letter: " + count);
	}
}
	


