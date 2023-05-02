package javaPractice;

public class Hashcode_1 {
	int a;
	Hashcode_1(int a){
		this.a=a;
	}
public boolean equals(Object obj) {
	Hashcode_1 h2=(Hashcode_1)obj;
	if(this.a==h2.a) {
		return true;
	}
	else {
		return false;
	}
}
public int hashCode() {
	return a+99;
}
public static void main(String[] args) {
	Hashcode_1 h1=new Hashcode_1(1);
	Hashcode_1 h2=new Hashcode_1(1);
	System.out.println(h1.equals(h2));
	System.out.println(h1.hashCode());
	System.out.println(h2.hashCode());
}
}
