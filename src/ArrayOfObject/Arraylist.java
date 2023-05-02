package ArrayOfObject;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	System.out.println(a.isEmpty());
	a.add(10);
	a.add("Tango");
	a.add("Charlie");
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.get(1));
	System.out.println(a.remove("Tango"));
	System.out.println(a.remove(0));
	System.out.println(a);
	a.add("Tango");
	a.add("Charlie");
	System.out.println(a);
	a.add(0, "Tango");
	System.out.println(a);
	Iterator i=a.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	for(Object c:a) {
		System.out.println(c);
	}
	
}
}
