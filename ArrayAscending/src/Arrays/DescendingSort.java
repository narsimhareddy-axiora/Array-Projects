package Arrays;

import java.util.Arrays;


import java.util.Collections;

public class DescendingSort {

	public static void main(String[] args) {
		
		Integer[] arr = {9,6,7,
				5, 2, 8, 1, 3};
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Descending Order = ");
        for (int num : arr) {
            System.out.print(num + " ");
		
		 }

	}

}
