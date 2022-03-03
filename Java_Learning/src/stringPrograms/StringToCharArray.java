package stringPrograms;

public class StringToCharArray {

	public static void main(String[] args) {
		
		String s="GOODMORNING";
		
		char arr[]=new char[11];
		
		for(int i=0;i<s.length();i++)
		{
			arr[i]=s.charAt(i);
			System.out.println("Arr[" + i + "] = " + arr[i]);
		}
		
		

	}

}
