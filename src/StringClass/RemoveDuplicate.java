package StringClass;

public class RemoveDuplicate {
public static void main(String[] args) {
	String s1="Hello Hye Hello How Hye Are You";
	String a[]=s1.split(" ");
	System.out.println(a[1]);
	String rev="";
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(rev.indexOf(a[j])==-1) {
				rev=rev+a[j];
			}
		}
	}
	System.out.println(rev);
}
}
