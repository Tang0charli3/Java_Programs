package javaPractice;

public class Narrowing {
public static void main(String[] args) {
	int i=10;
	byte b=(byte) i;
	System.out.println(b);
	
	double d=10.5;
	int i2=(int)d;
	System.out.println(i2);
	
	
	int i3=32770;
	short s=(short)i3;
	System.out.println(s);
	
	int q=1002;
	System.out.println((short)q);
}
}
