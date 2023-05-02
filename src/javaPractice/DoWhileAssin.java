package javaPractice;

public class DoWhileAssin {
public static void main(String[] args) {
	int i=1;
	do {
		if(i%3==0){
			System.out.println(i);
		}
		else if(i%5==0) {
			System.out.println(i);
		}
		i++;
	}while(i<=20);
}
}
