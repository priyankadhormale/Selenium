package Array;

public class Duplicatarry {

	public static void main(String[] args) {
		
		int arr[] = {2,5,7,4,6,4,2,8,3,5,7};
		
		System.out.println("Duplicate element in given array");
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

}
