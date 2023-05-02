package javaPractice;

public class WhileLoop3 {
public static void main(String[] args) {
	int num=0;
	int i=5;
	while(i<=10) {
		if(i%2!=0) {
			num=num+i;
		}
		i++;
	}
	System.out.println(num);
}
}
