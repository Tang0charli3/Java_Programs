package StringClass;

public class ToCharArray {
public static void main(String[] args) {
	String a="Darshan";
	char c[]=a.toCharArray();
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
	}
	String rev="";
	for(int i=c.length-1;i>=0;i--) {
		rev=rev+c[i];
	}
	System.out.println(rev);
}
}
