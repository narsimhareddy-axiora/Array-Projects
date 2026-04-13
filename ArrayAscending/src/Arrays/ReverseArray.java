package Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6};
		
		int Start = 0, end = arr.length-1;
		
		while ( Start < end){
			
			int temp = arr[Start];
			
			arr [Start] = arr [end];
			 arr [end] = temp;
			 Start++;
			 end--;
			 		
		}
for (int num : arr) {
	System.out.print(num  + " ");
	
}
	}

	
	
}
