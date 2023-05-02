package javaPractice;

public class Factorial {
public static void main(String[] args) {
	int num=1;
	int fact=1;
	while(num<=5) {
		fact=fact*num;
		num++;
	}
	System.out.println(fact);
}
}
