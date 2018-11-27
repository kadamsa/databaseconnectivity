package Com.basics;

public class RajaSoftware {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100;

		for (int i = 1; i <= n; i++) {

			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("Raja Software");
			}

			else if (i % 3 == 0) {
				System.out.println("Raja");
			} else if (i % 5 == 0) {
				System.out.println("software");
			}

			else {
				System.out.println(i);
			}

		}
	}

}
