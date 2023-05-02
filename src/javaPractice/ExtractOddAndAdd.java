package javaPractice;

public class ExtractOddAndAdd {
public static int sumoffactodd(int num) {
	int sum=0;
	while(num!=0) {
	int ld=num%10;
	if(ld%2==1) {
		int fact=1;
		for(int i=1;i<=ld;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
	}
	num=num/10;
	}
	return sum;
	
}
public static void main(String[] args) {
	System.out.println(sumoffactodd(12345));
}
}
