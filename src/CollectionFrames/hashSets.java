package CollectionFrames;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> st = new HashSet<String>();
		st.add("rahul");
		st.add("Roy");
		st.add("John");
		st.add("don");
		
		Iterator it = st.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
