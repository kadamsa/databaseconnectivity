package Com.basics;

public class PassArrayToFunction {

	public static void main(String args[]) {
		int arr[] = { 0, 1, 2, 3, 4, 5 };
		PassArrayToFunction obj = new PassArrayToFunction();

		int sum = obj.Addtion(arr);

		System.out.println(sum);

	}

	private int Addtion(int[] arr1) {

		// int len = arr.length;
		int sum = 0;

		for (int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
		}

		return sum;
	}

}
