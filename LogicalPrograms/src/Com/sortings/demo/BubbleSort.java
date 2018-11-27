package Com.sortings.demo;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 15, 5, 10, 11, 2, 8, 7, 22, 1 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
	}

}
