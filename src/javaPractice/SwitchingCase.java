package javaPractice;

import java.util.Scanner;

public class SwitchingCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String val=sc.nextLine();
	char ch[]=val.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]>=65&&ch[i]<=90) {
			ch[i]=(char)(ch[i]+32);
		}
		else if(ch[i]>=97&&ch[i]<=122) {
			ch[i]=(char)(ch[i]-32);
		}
	}
	String st=new String(ch);
	System.out.println(st);
}
}
