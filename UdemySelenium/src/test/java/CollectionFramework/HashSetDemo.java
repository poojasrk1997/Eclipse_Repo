package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		//Duplicate value not allowed
		//Unordered data
		//HashSet, LinkedSet and TreeSet - Implements Set Interface
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Learn");
		hs.add("JAVA");
		hs.add("Learn");
		hs.add("Language");
		hs.add("python");
		System.out.println(hs.isEmpty());
		//hs.clear();
		hs.remove("JAVA");
		System.out.println(hs.size());
		System.out.println(hs);
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		}

}
