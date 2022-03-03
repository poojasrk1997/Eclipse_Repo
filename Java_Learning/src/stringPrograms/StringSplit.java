package stringPrograms;

public class StringSplit {

	public static void main(String[] args) {
	
		String n="I LOVE JAVA PROGRAMMING";
		String[] words=n.split("\\s");
		int count=0;
		
		for(String s: words)
		{
			if(s.equalsIgnoreCase("java"))
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
