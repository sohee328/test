package lecture04;

import java.util.Arrays;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = new Integer[] {10, 3, 5, 2};
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int index = Arrays.binarySearch(a, 3);
		System.out.printf("index of \"3\": %d\n", index);
	}

}