package javaPractice;

import java.util.Scanner;

public class FindTheChar {
	public static void KindofChar(char a) {
		char ch=a;
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			if(ch>='A' && ch<='Z') {
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					System.out.println("Upper Case Vowel");
				}
				else {
					System.out.println("Upper Case Consonent");
				}
			}
			else {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					System.out.println("Lower Case Vowel");
				}
				else {
					System.out.println("Lower Case Consonent");
				}
			}
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("It is a Number");
		}
		else {
			System.out.println("It is Special Charecter");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	KindofChar(ch);
}
}
