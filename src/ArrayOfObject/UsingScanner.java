package ArrayOfObject;

import java.util.Scanner;

public class UsingScanner {
String name;
int eid;
double salary;
public UsingScanner(String name,int eid, double salary){
	this.name=name;
	this.eid=eid;
	this.salary=salary;
}
public String toString() {
	return "Name: "+this.name;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size");
	int size=sc.nextInt();
	UsingScanner arr[]=new UsingScanner[size];
	for(int i=0;i<size;i++) {
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the EID");
		int eid=sc.nextInt();
		System.out.println("Enter the Salary");
		double salary=sc.nextDouble();
		arr[i]=new UsingScanner(name,eid,salary);
	}
	for(int i=0;i<size;i++) {
		System.out.println(arr[i]);
	}
}
}
