package day_9;

import java.util.Arrays;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {67,89,90,77,66,55};
		Arrays.sort(arr1);
		int a =Arrays.binarySearch(arr1, 90);
		System.out.println(a);
		for (int b1:arr1)
			System.out.println(b1);
		System.out.println();

	}

}
