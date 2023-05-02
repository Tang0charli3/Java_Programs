package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class A {
public static void main(String[] args) {
	LinkedList l=new LinkedList<>();
	l.add(100);
	l.add(20);
	l.add(30);
	l.add("Tango");
	l.addFirst(100);
	l.addLast("Hu");
	System.out.println(l);
	ArrayList a=new ArrayList(l);
	a.add(l);
	System.out.println(a);
}
}
