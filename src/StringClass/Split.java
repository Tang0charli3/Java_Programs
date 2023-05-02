package StringClass;

public class Split {
public static void main(String[] args) {
	String a="My Name $5000 Is Darshan";
	String b[]=a.split(" ");
	for(int i=0;i<b.length;i++) {
		System.out.println(b[b.length-1]);
		break;
	}
}
}
