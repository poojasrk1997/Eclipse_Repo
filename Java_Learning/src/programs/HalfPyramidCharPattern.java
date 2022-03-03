package programs;

public class HalfPyramidCharPattern {

	public static void main(String[] args) {
		
		char i,j, row=67;
		for (i = 65; i <= row; i++) 
		{
			for (j = 65; j <= i; j++) 
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
	}

}
