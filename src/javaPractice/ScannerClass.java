package javaPractice;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Numbers");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double c=sc.nextDouble();
	System.out.println("The Product is "+a*b*c);
}
}
