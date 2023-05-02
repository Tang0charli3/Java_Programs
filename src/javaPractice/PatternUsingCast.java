package javaPractice;

public class PatternUsingCast {
public static void main(String[] args) {
	int k=64;
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			char c=(char)(k+j);
			System.out.print(c);
		}
		System.out.println();
	}
}
}
