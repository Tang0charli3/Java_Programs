package javaPractice;

public class Pattern2 {
public static void main(String[] args) {
	int space=4;
	int l=1;
	for(char i='A';i<='D';i++) {
		for(char k='A';k<=i;k++) {
			if(i%2==0) {
				System.out.print(l);
				l++;
			}
			else {
			System.out.print(k);
			l=1;
			}
		}
		System.out.println();
	}
}
}
