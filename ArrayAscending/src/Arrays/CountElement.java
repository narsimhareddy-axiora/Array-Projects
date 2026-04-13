package Arrays;

import  java.util.HashMap;

public class CountElement {

	public static void main(String[] args) {
		
int [] arr = {1,2,3,4,5,6,7,8,9,};

HashMap<Integer, Integer> map = new HashMap<>();


for (int num : arr) {
	map.put (num, map.getOrDefault(num,0) +1);
	
}
System.out.println(map);
	}

}
