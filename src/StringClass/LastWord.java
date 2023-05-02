package StringClass;

public class LastWord {
public static void main(String[] args) {
	String s="if you Invest Rs. 5,000/- per month for a period of 15 years your investment amount will be rs. 9,00,000/- and maturity amount will grow to Rs.25,22,880/-";
	String b[]=s.split(" ");
	System.out.println(b[b.length-1]);
	String c=b[b.length-1].replaceAll("[^0-9]", "");
	System.out.println(c);
	int d=Integer.parseInt(c);
	int sum=0;
	for(int i=0;i<c.length();i++) {
		int ld=d%10;
		sum=sum+ld;
		d=d/10;	
	}
	System.out.println(sum);
//	for(int i=0;i<b.length;i++) {
//		System.out.println(b[i]);
//	}
}
}
