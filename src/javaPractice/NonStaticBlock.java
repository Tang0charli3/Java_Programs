package javaPractice;

public class NonStaticBlock {
	static int b=10;
int a=10;
{
	a=20;
}
{
	b=30;
}
public static void main(String[] args) {
	System.out.println("Main Method");
	NonStaticBlock a1=new NonStaticBlock();
	System.out.println(a1.a);
	System.out.println(a1.b);
}
}
