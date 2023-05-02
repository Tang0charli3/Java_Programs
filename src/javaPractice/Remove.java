package javaPractice;

public class Remove {
public static void main(String[] args) {
	String a="Darshan123d";
int t=0;
	char c[]=a.toCharArray();
	for(int i=0;i<c.length;i++) {
	char d=c[i];
	if(Character.isDigit(c[i])) {
		String b=a.replaceAll("[^0-9]", "");
		t=Integer.parseInt(b);
	}
	}
	System.out.println(t);
}
}
