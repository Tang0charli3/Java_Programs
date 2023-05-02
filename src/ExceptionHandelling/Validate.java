package ExceptionHandelling;

import java.util.Scanner;

public class Validate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a>18) {
		System.out.println("You are elegible to vote");
	}
	else {
		throw new YoungerAgeException("You can't Vote");
	}
}
}
