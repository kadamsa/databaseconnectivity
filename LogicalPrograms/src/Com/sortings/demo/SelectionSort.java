package Com.sortings.demo;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 11, 6, 5, 12, 13, 1 };

		for (int i = 0; i < a.length; i++) {

			int pos = smallest(a, 6, i);

			int temp;
			temp = a[i];
			a[i] = a[pos];
			a[pos] = temp;

		}

		System.out.println("Printing  sorted array........");
		for (int i = 0; i < a.length; i++) {
			// \u000d System.out.println(a[i]);
		}

	}

	private static int smallest(int[] a, int i, int h) {

		int min = a[h];

		int pos = h;
		for (int j = h + 1; j < a.length; j++) {

			if (min > a[j]) {
				min = a[j];

				pos = j;
			}

		}

		return pos;
	}

}
