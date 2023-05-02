package javaPractice;

public class Cons3 {
int a;
Cons3(int a){
	this.a=this.a+a;
}
{
	a=30;
}
public static void main(String[] args) {
	System.out.println("Main Method");
	Cons3 c=new Cons3(10);
	System.out.println(c.a);
}
}
