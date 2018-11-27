package Com.exception.demo;

public class TestThrow {

	int age;

	public void validate(int age) {

		if (age < 18) {
			throw new ArithmeticException("Not valid to vote.");
		} else {
			System.out.println("Congrats you are eligible to vote.");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestThrow t1 = new TestThrow();

		t1.validate(18);

		System.out.println("Rest of code...");

	}

}
