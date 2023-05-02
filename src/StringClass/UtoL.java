package StringClass;

public class UtoL {
public static void main(String[] args) {
	String a="HdfDFTEfwllo How and Hi";
	String b[]=a.split(" ");
	for(int i=0;i<b.length;i++) {
		String temp=b[i];
		if(b[i].startsWith("H")) {
		b[i]=b[i].substring(0, 1).toLowerCase()+b[i].substring(1).toUpperCase();
	}
	}
	
	String c="";
	for(int i=0;i<b.length;i++) {
		c=c+b[i]+" ";
	}
	System.out.println(c);
}
}
