package javaPractice;

public class ArrayAssingment3 {
	public static int fact(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			int fact=1;
			for(int j=1;j<=a[i];j++) {
				fact=fact*j;
			}
			sum=sum+fact;
		}
		return sum;
	}
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b=fact(a);
	System.out.println(b);
}
}
