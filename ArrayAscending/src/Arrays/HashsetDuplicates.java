package Arrays;

import java.util.HashSet;


public class HashsetDuplicates {

	public static void main(String[] args) {
		
      int [] arr = {1,1,3,3,4,4,5,6,6,3,9};
      HashSet <Integer> set = new HashSet<>();
      
      for (int num : arr) {
    	  if (! set.add (num));
    	System.out.println("Duplicate = " + num);
      }

	}

}
