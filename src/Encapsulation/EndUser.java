package Encapsulation;

public class EndUser {
public static void main(String[] args) {
	Collage c1=new Collage("Darshan",1,"6TH",0);
	Collage c2=new Collage("Tango",2,"6TH",2);
	Collage c3=new Collage("Charlie",3,"6TH",3);
	Collage c4=new Collage("Atom",4,"6TH",4);
	Collage c5=new Collage("Astro",5,"6TH",5);
	displayDetails(c1);
	displayDetails(c2);
}
public static void displayDetails(Collage c) {
	System.out.println("Student Name:"+c.getstudentName());
	System.out.println("Register No:"+c.getregno());
	System.out.println("Semister:"+c.getsemister());
	System.out.println("Backlog:"+c.getbacklog());
	System.out.println("=================================");
}
}
