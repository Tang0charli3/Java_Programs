package javaPractice;

public class MethodOverloadingOnLength {
	public static void method(int a) {
		System.out.println(a);
	}
	public static void method(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		method(1);
		method(10,20);
}
}