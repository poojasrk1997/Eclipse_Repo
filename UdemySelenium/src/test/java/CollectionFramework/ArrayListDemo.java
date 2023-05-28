package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Duplicate values are allowed
		//Ordered data
		//ArrayList, LinkedList
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Pooja");
		al.add("Saurav");
		al.add("Rimpa");
		System.out.println(al.indexOf("Saurav"));
		System.out.println(al.contains("Pooja"));
		System.out.println(al.get(2));
		//System.out.println(al);
		
		Iterator<String> it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
