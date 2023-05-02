package javaPractice;

public class Array3 {
public static void sum(int b[]) {
	int sum=0;
	for(int i=0;i<b.length;i++) {
		sum=sum+b[i];
	}
	System.out.println(sum);
}
public static void main(String[] args) {
	int b[]= {1,2,3,4,5};
	sum(b);
}
}
