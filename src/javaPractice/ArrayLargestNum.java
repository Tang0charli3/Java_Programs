package javaPractice;

public class ArrayLargestNum {
	public static int lar(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int l=lar(a);
	System.out.println(l);
}
}
