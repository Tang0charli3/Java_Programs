package WrapperClass;

public class SumOfNumber {
public static void main(String[] args) {
	String s="Dec26year2022";
	
	String s1=s.substring(2, 5);
	System.out.println(s1);
	String b= s.replaceAll("[^0-9]", "");
	int c=Integer.parseInt(b);
	int temp=c;
	int sum=0;
	for(int i=0;i<b.length();i++) {
		int ld=temp%10;
		sum=sum+ld;
		temp=temp/10;
	}
	System.out.println(sum);
}
}
