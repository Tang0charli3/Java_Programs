package Upcasting;

public class Driver2 {
public static void main(String[] args) {
	AA a1=new BB();
	BB b1=(BB)a1;
	System.out.println(b1.a);
	System.out.println(b1.c);
}
}
