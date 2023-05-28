package JavaPrograms;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputstr="poojakharatmol";
		String outputstr="";
		
		for(int i=inputstr.length()-1;i>=0;i--)
		{
			outputstr=outputstr+inputstr.charAt(i);
		}
		System.out.println(outputstr);

	}

}
