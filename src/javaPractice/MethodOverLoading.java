package javaPractice;

public class MethodOverLoading {
public static void method(int a) {
	System.out.println(a);
}
public static void method(String a) {
	System.out.println(a);
}
public static void main(String[] args) {
	method(1);
	method("a");
}
}
