package CollectionFrames;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(10, "rahul");
		mp.put(20, "raj");
		mp.put(30, "joy");
		mp.put(55, "roy");
		
		//System.out.println(mp.get(55));
		Set st = mp.entrySet();
		
		Iterator it = st.iterator();
		while(it.hasNext()) {
			//Map.Entry mp2= (Map.Entry<Integer, String>) it.next();
			Map.Entry mp2= (Map.Entry) it.next();
			System.out.println(mp2.getKey());
			System.out.println(mp2.getValue());
		}

	}

}
