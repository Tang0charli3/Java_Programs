package javaPractice;

public class CombinationOfStaticNonStatic {
static {
	System.out.println("sib-1");
}
static {
	System.out.println("sib-2");
}
{
	System.out.println("lib-1");
}
{
	System.out.println("lib-2");
}
public static void main(String[] args) {
	System.out.println("main method");
	CombinationOfStaticNonStatic a1=new CombinationOfStaticNonStatic();
}
}
