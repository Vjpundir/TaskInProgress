package InProgressItems;

public class ArrayOne {

	public static void main(String[] args) {

		int[] a = { 2, 4, 6, 6, 9, 5, 3, 8, 4, 33, 21 };

		int sum = 0;
		float avg = 0;

		for (int x : a) {
			sum = sum + x;

		}

		avg = sum / a.length;

		System.out.println("Sum of Array element:" + sum);
		System.out.println("Average of Array element:" + avg);

	}

}
