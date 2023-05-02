package javaPractice;

public class ArrayAssingment1 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int prod=1;
	for(int i=0;i<a.length;i++) {
		prod=prod*a[i];
	}
	System.out.println(prod);
}
}
