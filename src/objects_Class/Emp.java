package objects_Class;

import java.util.Objects;

public class Emp {
int eid;
String ename;
double salary;
public Emp(int eid, String ename, double salary) {
	this.eid=eid;
	this.ename=ename;
	this.salary=salary;
}
//overriding toString()
public String toString() {
	return "Details of Student "+ename;
}
//overriding equals method
public boolean equals(Object obj) {
	Emp e2=(Emp)obj;
	if(this.eid==e2.eid && this.ename==e2.ename && this.salary==salary) {
		return true;
	}
	else {
		return false;
	}
}
public int hashCode() {
	return Objects.hash(eid,ename,salary);
}
public static void main(String[] args) {
	Emp e1=new Emp(1,"Darshan",10.1);
	Emp e2=new Emp(1,"Darshan",10.1);
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e1.equals(e2));
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
}
}
