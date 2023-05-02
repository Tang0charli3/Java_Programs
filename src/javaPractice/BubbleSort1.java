package javaPractice;

public class BubbleSort1 {
public static void main(String[] args) {
	int a[]= {2,5,1,8};
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
