package ua.com.juja.study.core.presentation.procedural;

import java.util.Arrays;

/**
 * User: viktor
 * Date: 7/12/15
 */
public class SortDemo {

	public static void main(String[] args) {
		int[] arr = {3, 5, 1, 2, 4};
		System.out.println(Arrays.toString(arr));
		insertSort(arr);
//		selectSort(arr);
	}

	private static void selectSort(int[] arr) {
		for (int barrier = 0; barrier < arr.length - 1; barrier++) {
			for (int index = barrier + 1; index < arr.length; index++) {
				if (arr[barrier] > arr[index]) {
					int tmp = arr[index];
					arr[index] = arr[barrier];
					arr[barrier] = tmp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void insertSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int newElement = arr[i];
			int location = i - 1;
			while (location >= 0 && arr[location] > newElement) {
				arr[location + 1] = arr[location];
				location--;
			}
			arr[location + 1] = newElement;
			System.out.println(Arrays.toString(arr));
		}


	}
}
