package javaPractice;

public class WhileLoop4 {
public static void main(String[] args) {
	int num=1634;
	//int sum=0;
	int count=0;
	while(num>0) {
		//int ld=num%10;
		//sum=sum+ld;
		num=num/10;
		count++;
	}
	System.out.println(count);
}
}
