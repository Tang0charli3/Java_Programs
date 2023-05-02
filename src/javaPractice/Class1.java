package javaPractice;

public class Class1 {
public static void main(String[] args) {
	Class2.a=10;
	Class2.b=20;
	Class2 c1=new Class2();
	System.out.println(Class2.b);
	System.out.println(c1.a);
	c1.method();
	c1.method(10);
}
}
