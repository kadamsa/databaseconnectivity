package Com.exception.demo;

public class TestExceptionPropogation {

	public void m() {
		int a = 50 / 0;
	}

	public void n() {
		m();
	}

	public void s() {
		try {

			n();

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("Exception handled");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestExceptionPropogation t1 = new TestExceptionPropogation();

		t1.s();
		System.out.println("rest of code");
	}

}
