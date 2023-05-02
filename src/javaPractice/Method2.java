package javaPractice;
// Write a program to create a method in order to find the product of 3 variable
public class Method2 {
public static void prod(int a, int b, int c) {
	int d=a*b*c;
	System.out.println("Product of 3 Numbers is "+d);
}
public static void main(String[] args) {
	prod(2,4,6);
	Method2.prod(10, 20, 30);
}
}
