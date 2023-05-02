package StringClass;

public class StartsWith {
public static void main(String[] args) {
	String a="Darshan";
	System.out.println(a.length());
	System.out.println(a.startsWith("D"));
	System.out.println(a.endsWith("n"));
	System.out.println(a.startsWith("Dar"));
	System.out.println(a.startsWith("a", 5));
	System.out.println(a.startsWith("r", a.indexOf("r")));
	System.out.println(a.indexOf('r'));
	System.out.println(a.lastIndexOf("a"));
	String b="HoHoH";
	System.out.println(b.substring(b.indexOf('H')+1).indexOf('H')+1);
	System.out.println(b.indexOf('H', 1));
}
}
