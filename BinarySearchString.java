package day16_17;

import java.util.Arrays;

public class BinarySearchString {

	public static void main(String[] args) {
		String st = "Hello guys how are you i am going to hell";
		String[] sr = st.toLowerCase().split(" ");
		Arrays.sort(sr);
		binarySearch(sr, "how");
		binarySearch(sr, "hello");
		binarySearch(sr, "er");
	}

	static void binarySearch(String[] arr, String f) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			int res = f.compareTo(arr[m]);
			if (res == 0) {
				System.out.println(f + " is present");
				return;
			}
			if (res > 0)
				l = m + 1;
			else
				r = m - 1;
		}
		System.out.println(f + " Not Found");
	}

}
