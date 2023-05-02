package javaPractice;

public class HashCode {
int a;
HashCode(int a){
	this.a=a;
	System.out.println(a);
}
public int hashCode() {
	return a;
}
public static void main(String[] args) {
	HashCode h1=new HashCode(1);
	System.out.println(h1.hashCode());
}
}
