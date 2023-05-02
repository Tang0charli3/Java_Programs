package javaPractice;

public class MethodNonStatic {
public void div(int a,int b) {
	int c=a/b;
	System.out.println(c);
}
public static void main(String[] args) {
	MethodNonStatic div=new MethodNonStatic();
	div.div(20, 10);
}
}
