package stringPrograms;

public class ReverseName {

	public static void main(String[] args) {
		
		//Reversing the word on same location 
		String s="I Love My Country";
		String arr[] = s.split("\\s");
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++)
		{
			//System.out.print(arr[i]);
			String word=arr[i];
			String reverseWord = ""; 
			
			for(int j=word.length()-1; j>=0; j--)
			{
				reverseWord = reverseWord +  word.charAt(j);
			}
			System.out.print(reverseWord);
			System.out.print(" ");
		}
		
		
		

	}

}
