package StringClass;

public class ReverseSentence {
	public static void main(String[] args) {
		String a="Hello How and You";
		String b[]=a.split(" ");
		
		String c="";
		for(int i=b.length-1;i>=0;i--) {
			c=c+" "+b[i];
		}
		System.out.println(c);
	}
}
