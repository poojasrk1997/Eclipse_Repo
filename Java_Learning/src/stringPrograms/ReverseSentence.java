package stringPrograms;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String s="My Name Is Pooja";
		
		String[] arr= s.split("\\s");
		
		for(int j= arr.length-1;j>=0;j--)
		{
		
		for(int i = arr[j].length()-1;i>=0;i--)
		{
			char c=arr[j].charAt(i);
			//System.out.print(arr[i] + " ");
			System.out.print(c + " ");
		}
		
		}
	}

}
