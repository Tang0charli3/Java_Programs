package javaPractice;

public class StringClass {
public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=10;i++) {
		int no=i;
		int count=0;
		for(int j=1;j<=10;j++) {
			if(no%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(no);
		}
				
	}
}
}