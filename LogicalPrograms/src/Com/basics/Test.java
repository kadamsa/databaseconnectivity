package Com.basics;

public class Test {
	public static void main(String... args) {
		int num = 101;
		for (int i = 1; i < num; i++) {
			boolean printed = false;

			if (i % 3 == 0 && i % 5 == 0) {
				printed = true;
				System.out.print("Fizz Buzz");
			}
			if (i % 5 == 0) {
				printed = true;
				System.out.print("Buzz");
			}
			if (i % 3 == 0) {
				printed = true;
				System.out.print("fizz");
			}
//			if (Integer.toString(i).indexOf("3") != -1) {
//				printed = true;
//				System.out.print("Bizz");
//			}
//			if (Integer.toString(i).indexOf("5") != -1) {
//				printed = true;
//				System.out.print("Fuzz");
//			}

			if (printed == false)
				System.out.print(i);
			System.out.println();
		}
	}
}