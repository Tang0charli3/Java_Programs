package javaPractice;

public class Cons2 {
	String sname;
	int roll;
	String sclass;
	double per;
	public Cons2 (String sname, int roll, String sclass, double per){
		this.sname=sname;
		this.roll=roll;
		this.sclass=sclass;
		this.per=per;
		System.out.println(" Student Name: "+this.sname+ " Roll Number: "+this.roll+" Student class: "+this.sclass+ " Percentage: "+this.per);
	}
public static void main(String[] args) {
	Cons2 c1=new Cons2("Tango",01,"11th",80.32);
	Cons2 c2=new Cons2("Tango",02,"11th",70.32);
	Cons2 c3=new Cons2("Tango",03,"11th",90.32);
	Cons2 c4=new Cons2("Tango",04,"11th",60.32);
	Cons2 c5=new Cons2("Tango",05,"11th",50.32);
}
}
