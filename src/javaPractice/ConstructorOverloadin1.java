package javaPractice;

public class ConstructorOverloadin1 {
	ConstructorOverloadin1(int a){
		System.out.println(a);
	}
	ConstructorOverloadin1(int a, int b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		ConstructorOverloadin1 c1=new ConstructorOverloadin1(10);
		ConstructorOverloadin1 c2=new ConstructorOverloadin1(10,20);
	}
}
