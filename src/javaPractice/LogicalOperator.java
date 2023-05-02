package javaPractice;

public class LogicalOperator {
public static void main(String[] args) {
	int a=1;
	int b=2;
	if(++a>=b&&b==a) {
		System.out.println("A is equal to B");
	}
	else {
		System.out.println("A is not equal to B");
	}
	if(++a==b || ++b==a) {
		System.out.println("One Expression is True");
	}
	else {
		System.out.println("Both are False");
	}
}
}
