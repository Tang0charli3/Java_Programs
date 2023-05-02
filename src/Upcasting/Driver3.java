package Upcasting;

public class Driver3 {
public static void main(String[] args) {
	A1 a1=new A1();
	a1.m();
	B1 b1=new B1();
	//b1.m();
	C1 c1=new C1();
	//c1.m();
	b1=c1;
	b1.m();
}
}
