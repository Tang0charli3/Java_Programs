package javaPractice;

import java.util.Scanner;

public class SwitchCaseAssingment2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Charecter");
	String ch=sc.next();
	switch(ch) {
	case "A": System.out.println("Upper case Vovel");
	break;
	case "E": System.out.println("Upper case Vovel");
	break;
	case "I": System.out.println("Upper case Vovel");
	break;
	case "O": System.out.println("Upper case Vovel");
	break;
	case "U": System.out.println("Upper case Vovel");
	break;
	case "a": System.out.println("Upper case Vovel");
	break;
	case "e": System.out.println("Upper case Vovel");
	break;
	case "i": System.out.println("Upper case Vovel");
	break;
	case "o": System.out.println("Upper case Vovel");
	break;
	case "u": System.out.println("Upper case Vovel");
	break;
	default : System.out.println("It is a Consonent");
	}
}
}
