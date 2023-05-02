package StringClass;

public class StringClass {

	public static void main(String[] args) {
		String s1=new String("Hello");//2 Objects
		System.out.println(s1);
		String s2=new String("Hello");//1 Objects
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		String s3=s2;
		System.out.println(s3);
		System.out.println(s2.equals(s3));
		System.out.println(s2==s3);
	}
}
