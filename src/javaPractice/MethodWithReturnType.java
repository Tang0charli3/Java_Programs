package javaPractice;

public class MethodWithReturnType {
public static int add(int a, int b) {
	int add=a+b;
	return add;
}
public static void main(String[] args) {
	int result=add(10,20);
	System.out.println(result);
}
}
