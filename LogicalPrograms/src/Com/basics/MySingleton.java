package Com.basics;

public class MySingleton {

	private static MySingleton myObj;
	public String s;

	static {
		myObj = new MySingleton();
	}

	private MySingleton() {
		s = "sachin";
	}

	public static MySingleton getInstance() {
		return myObj;
	}

	public void testMe() {
		System.out.println("Hey.... it is working!!!");
	}

	public static void main(String a[]) {

		MySingleton ms = getInstance();
		ms.s = (ms.s).toUpperCase();
		System.out.println(ms.s);
		ms.testMe();

		MySingleton s1 = getInstance();
		System.out.println(s1.s);

	}
}