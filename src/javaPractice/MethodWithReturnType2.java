package javaPractice;
//write a program to find the product of 3 variable and return the value to the method call statement
public class MethodWithReturnType2 {
public static double prod(int a, int b,int c) {
	double prod=a*b*c;
	return prod;
}
public static void main(String[] args) {
	double result=prod(10,20,30);
	System.out.println(result);
}
}