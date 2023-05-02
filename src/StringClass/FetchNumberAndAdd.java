package StringClass;

public class FetchNumberAndAdd {
public static void main(String[] args) {
	String str="Darshan@123";
	char[] a=str.replaceAll("[^0-9]", "").toCharArray();
	
	String num="";
	int sum=0;
	

	for(int i=0;i<a.length;i++) {
		num+=a[i];
		//System.out.println(num);
		sum=sum+Integer.parseInt(num);
		num="";
		
	}

	System.out.println(sum);
}
}

