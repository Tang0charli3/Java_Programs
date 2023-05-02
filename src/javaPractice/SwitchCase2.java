package javaPractice;

import java.util.Scanner;

public class SwitchCase2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int num=sc.nextInt();
	switch(num%2) {
	case 0 : System.out.println("Even");
	break;
	default : System.out.println("Odd");
	}
}
}
