package javaPractice;

import java.util.Scanner;

public class WhileLoop {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	int i=1;
	while(i<=num) {
		System.out.println("Tango");
		i++;
	}
}
}
