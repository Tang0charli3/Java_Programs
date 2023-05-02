package ArrayOfObject;

public class Emp {
	String name;
	int eid;
	double salary;
	static int count=0;
	Emp(String name,int eid,double salary){
		this.salary=salary;
		this.name=name;
		this.eid=eid;
		count++;
	}
public static void main(String[] args) {
	Emp e1=new Emp("Darshan",101,30.000);
	Emp e2=new Emp("Tango",102,30.000);
	Emp e3=new Emp("Charlie",103,30.000);
	
	Emp arr[]=new Emp[count];
	arr[1]=e2;
	arr[2]=e3;
	arr[0]=e1;
	
}
}
