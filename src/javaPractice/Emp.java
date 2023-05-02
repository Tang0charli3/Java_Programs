package javaPractice;

public class Emp {
int eid;
Emp(int eid){
	this.eid=eid;
}
public String toString() {
	return "Eid-"+this.eid;
}
public static void main(String[] args) {
	Emp e1=new Emp(1);
	System.out.println(e1);
	Emp e2=new Emp(2);
	System.out.println(e2);
}
}
