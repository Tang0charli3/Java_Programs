package Set;

import java.util.HashSet;
import java.util.Iterator;


public class HashSet1 {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(10);
	h.add(20);
	h.add("Tango");
	h.add(10);
	for(Object o:h) {
	System.out.println(o);
	}
	Iterator i=h.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
}
}
