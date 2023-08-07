package Array;

public class ReverseOrder {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6,7,8,9,10,11,2,3};
		
		System.out.println(arr.length); 
		System.out.println("Original array"); 
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			}
		System.out.println();
		System.out.println("Reverse array");
		
		for(int j=11; j>=0; j--) {    
			System.out.println(arr[j]+" ");
		}
		
		
	   }

}
