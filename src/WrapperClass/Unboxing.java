package WrapperClass;

public class Unboxing {
public static void main(String[] args) {
	Integer a=10;
	int b=a.intValue();
	System.out.println(b);
	
	Double d=10.2;
	double d1=d.doubleValue();
	System.out.println(d1);
	//double e=Double.parseDouble(d);
}
}
