package interviewDemo;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicateChar {

	public static void main(String[] args) {
		
		String string = "aabbccdefatafaz";
		
		//Converting string to char array, use set as set contains only unique value, no duplicates allowed in set
		
		char[] chars = string.toCharArray();
	
		Set<Character> charSet = new HashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		    
		}
		
		for (char set : charSet) {
			System.out.print(set);
		}
		
		
		


	}

}
