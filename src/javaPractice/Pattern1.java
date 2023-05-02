package javaPractice;

//import java.util.Scanner;

public class Pattern1 {
	public static void main (String [] args){
	int space=4;
	for(char i='a';i<='d';i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		space--;
		for(char k='a';k<=i;k++) {
			System.out.print(i);
		}
		System.out.println();
	}
}
}