package JavaPrograms;

import java.util.HashMap;

public class duplicateString {

	public static void main(String[] args) {
		
		String inputstr="aaabbccccddddd";
		
		HashMap<Character,Integer> hm=new HashMap();
		char[] strarray=inputstr.toCharArray();
		
		for(char c:strarray)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		

	}

}
