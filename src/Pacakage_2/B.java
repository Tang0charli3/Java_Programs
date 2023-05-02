package Pacakage_2;
import Pacakage_1.A;
public class B extends A {
public static void main(String[] args) {
	B b1=new B();
	System.out.println(b1.a);
	System.out.println(b1.name);
	B.m();
	A.m();
	b1.a=30;
	System.out.println(b1.b);
}
}
