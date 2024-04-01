package Array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 5, 2, 7, 3, 8, 9, 1, 6, 4 };
		System.out.println("Before the sorting");
		System.out.println(Arrays.toString(arr));

		bubbleSort(arr);

		System.out.println("After the sorting");
		System.out.println(Arrays.toString(arr));

	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}
