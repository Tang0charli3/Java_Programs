package javaPractice;

public class NewNew {
	public static void main(String[] args) {
		String key="right click me";
		String path="//span[(contains(@class,'btn')) and (contains(text(),'"+key+"'))]";
		System.out.println(path);
	}
}
