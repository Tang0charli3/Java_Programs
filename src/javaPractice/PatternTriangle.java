package javaPractice;

public class PatternTriangle {
public static void main(String[] args) {
	int n=4;
	for(int row=1;row<=n;row++) {
		for(int space=n-1;space>=row;space--) {
			System.out.print(" ");
		}
		for(int col=1;col<=2*row-1;col++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
