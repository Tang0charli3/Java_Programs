package Set;

import java.util.PriorityQueue;

public class C {
public static void main(String[] args) {
	PriorityQueue p=new PriorityQueue();
	p.offer(10);
	p.add(20);
	p.offer(10);
	p.offer(100);
	for(Object o:p) {
		System.out.println(o);
	}
}
}
