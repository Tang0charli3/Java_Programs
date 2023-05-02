package javaPractice;
// Write a Program to create a Method in order to add 2 number?
public class MethodsStatic{
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		add(10,20);
		MethodsStatic.add(5,2);
	}
}
