package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//Accept values in key value pair
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Pooja");
		hm.put(2, "null");
		hm.put(3, "Saurav");
		//hm.clear();
		System.out.println(hm.containsValue("Saurav"));
		System.out.println(hm.get(2));
		//System.out.println(hm);
		
		Set st=hm.entrySet();
		Iterator it=st.iterator();
		
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue()); 
		}
		
	}

}
