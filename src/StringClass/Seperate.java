package StringClass;

public class Seperate {
public static void main(String[] args) {
	String s="ELF 40 Dec 20";
	String s1=s.replaceAll("[^0-9]", "");
	String s2=s.replaceAll("[^A-Za-z]", "");
	int sum=0;
	int num=Integer.parseInt(s1);
	int temp=num;
	for(int i=0;i<s1.length();i++) {
		int ld=temp%10;
		sum=sum+ld;
		temp=temp/10;
		
	}
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(sum);
}
}
