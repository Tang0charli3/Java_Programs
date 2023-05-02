
public class Emp {
int eid;
Emp(int eid){
	this.eid=eid;
}
public static void main(String[] args) {
	Emp e1=new Emp(1);
	System.out.println(e1);
	System.out.println(e1.toString());
}
}
