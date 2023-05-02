package StringClass;

public class Replace {
public static void main(String[] args) {
	String s="aaaa bbb cc d";
	//String s1="Hello Hye Hello How Hye Are You";
	s=s.replace(" ", "");
	char c[]=s.toCharArray();
	String s1="";
	for(int i=0;i<c.length;i++) {
		if(s1.indexOf(c[i])==-1) {
			s1=s1+c[i];
		}
	}
	System.out.println(s1);
}
}
