package ua.com.juja.study.core.presentation.procedural;

import java.util.Arrays;

/**
 * User: viktor
 * Date: 7/12/15
 */
public class SearchDemo {

	private static int operationCount = 0;
	private static boolean debug = false;

	public static void main(String[] args) {
		int[] arr = new int[] {-78, -54, -23, -10, -8, -6, -4, -2, -1, 1, 3,
				5, 67, 78, 89, 92, 93, 94, 99, 100, 101, 102};
//		System.out.println(linearSearch(arr, 102));
		debug = true;
		System.out.println(binarySearch(arr, -24));
		System.out.println("Operation count is " + operationCount);
	}

	static int linearSearch(int[] array, int x) {
		for (int i = 0; i < array.length; i++) {
			operationCount++;
			if (array[i] == x) {
				return i;
			}
		}
		return -1;
	}

	static int binarySearch(int[] array, int x) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			operationCount++;
			debug(array, low, high);
			int mid = (low + high) / 2;
			int midVal = array[mid];
			if (midVal < x)
				low = mid + 1;
			else if (midVal > x)
				high = mid - 1;
			else
				return mid;
		}
		return -1;
	}

	static void debug(int[] array, int low, int high) {
		if (debug) {
			int length = high - low + 1;
			int[] subarray = new int[length];
			System.arraycopy(array, low, subarray, 0, length);
			System.out.println("{" + low + ":" + high + "} " + Arrays.toString(subarray));
		}
	}
}
