package StringClass;

public class Concat {
public static void main(String[] args) {
	String s1=new String("Hello");//2 Objects
	System.out.println(s1);
	System.out.println(s1.concat(" All"));
	System.out.println(s1);
	s1=s1.concat(" All");
	System.out.println(s1);
}
}
