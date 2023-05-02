package javaPractice;

public class WhileLoopAssingment2 {
public static void main(String[] args) {
	int i=1;
	int even=0;
	int odd=0;
	while(i<=20) {
		if(i%2==0) {
			even=even+i;
		}
		else {
			odd=odd+i;
		}
		i++;
	}
	System.out.println("Sum of even is " + even);
	System.out.println("Sum of Odd is " + odd);
}
}
