package javaPractice;

public class Constructor1 {
	String name;
	double salary;
	int eid;
public Constructor1(String n,double s,int e) {
	name=n;
	salary=s;
	eid=e;
	System.out.println(name + salary + eid);
}
public static void main(String[] args) {
	Constructor1 e1=new Constructor1("Tango",100000.0,01);
}
}
