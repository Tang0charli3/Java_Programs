package StringClass;

public class RemoveChar {
public static void main(String[] args) {
	String a="aabbbccddeefff";
	char b[]=a.toCharArray();
	String rev="";
	String temp=a;
	for(int i=0;i<b.length;i++) {
		if(rev.indexOf(b[i])==-1) {
			rev=rev+b[i];
		}
	}
	System.out.println(rev);
	
	
	String rev2="";
	for(int i=0;i<a.length()-1;i++) {
		if(a.charAt(i)!=a.charAt(i+1)) {
			rev2=rev2+a.charAt(i);
		}
	}
	System.out.println(rev2);
}
}
