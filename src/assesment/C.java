package assesment;

interface A {
public void m();
}

interface B{
public void m1();
}
public class C implements A,B{
	public void m() {
		System.out.println("Method-1");
	}
	public void m1() {
		System.out.println("MEthod-2");
	}
}
