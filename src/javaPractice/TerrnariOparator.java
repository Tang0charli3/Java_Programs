package javaPractice;

public class TerrnariOparator {
public static void main(String[] args) {
	int a=50;
	int b=40;
	int c=30;
	int d=(a>b)?a:b;
	int e=(a>c)?a:c;
	System.out.println((d>e)?d:e);
	int result=(a>b)?((a>c)?a:c):((b>c)?b:c);
	System.out.println(result + " is Greater");
}
}
