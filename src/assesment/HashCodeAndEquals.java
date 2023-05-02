package assesment;

public class HashCodeAndEquals {
	int a;
	HashCodeAndEquals(int a){
		this.a=a;
}
public boolean equals(Object obj) {
	HashCodeAndEquals h2=(HashCodeAndEquals)obj;
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
	HashCodeAndEquals h1=new HashCodeAndEquals(1);
	HashCodeAndEquals h2=new HashCodeAndEquals(1);
	System.out.println(h1.equals(h2));
	System.out.println(h1.hashCode());
	System.out.println(h2.hashCode());
}
}
