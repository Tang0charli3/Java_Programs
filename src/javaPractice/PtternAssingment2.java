package javaPractice;

public class PtternAssingment2 {
public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		int l=i;
		for(int j=1;j<=3;j++) {
			if(j%2==1) {
				System.out.print(l);
				l=i+3;
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}
