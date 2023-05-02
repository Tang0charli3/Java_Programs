package ArrayOfObject;

import java.util.ArrayList;

public class HomogeneList {
public static void main(String[] args) {
	ArrayList <Integer> a=new ArrayList();
	a.add(18);
	a.add(10);
	a.add(11);
	a.add(1, 20);
	a.add(1, 30);
	for(Object i:a) {
		System.out.print(i+" ");
	}
	//a.addAll(a);
//	ArrayList <Integer> b=new ArrayList();
//	b.add(10);
//	b.add(100);
//	
//	System.out.println(a);
//	System.out.println(b);
//	b.addAll(a);
//	System.out.println(b);
//	System.out.println(b.containsAll(a));
//	System.out.println(b);
//	//b.retainAll(a);
//	//System.out.println(b);
//	b.removeAll(a);
//	System.out.println(b);
}
}
