package javaPractice;

public class College {
String studentName;
String semister;
int backLogs;
College(String studentName, String semister,int backLogs){
	this.studentName=studentName;
	this.semister=semister;
	this.backLogs=backLogs;
	System.out.println("Name: "+this.studentName+" :: "+"Semister: "+this.semister+" :: "+"Backlogs: "+this.backLogs);
}
public String toString() {
	return "Student details of "+ this.studentName;
}
public static void main(String[] args) {
	College c1=new College("Darshan","6th",0);
	System.out.println(c1);
	
}
}
