package StringClass;

public class Reverse {
public static void main(String[] args) {
	String s1="Hello";
	System.out.println(s1.length());
	String s2=s1.toUpperCase();
	System.out.println(s2);
	System.out.println(s1);
	System.out.println(s1.charAt(1));
	for(int i=0;i<s1.length();i++) {
		System.out.println(s1.charAt(i));
	}
	String rev="";
	for(int i=s1.length()-1;i>=0;i--) {
		rev=rev+s1.charAt(i);
	}
	System.out.println(rev);
}
}
