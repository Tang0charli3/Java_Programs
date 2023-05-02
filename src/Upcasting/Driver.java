package Upcasting;

public class Driver {
public static void main(String[] args) {
	C c1=new C();
	A a1=new A();
	a1=c1;
	System.out.println(a1);
	System.out.println(c1);
	C c2=(C)a1;
	System.out.println(c2.a);
	//B b1;
	B b1=new C();
	C c3=(C)b1;
	c3.e=10;
	System.out.println(c3.e);
}
}
