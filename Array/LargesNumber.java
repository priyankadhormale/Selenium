package Array;

public class LargesNumber {

	public static void main(String[] args) {
		
		int arr[] = {3,5,878,333,74};
		System.out.println(arr.length);    //5
		int maximum = arr[0];
		
		System.out.println(maximum);
	

		//0<5
		//1<5
		//2<5
		//3<5
		//4<5
		//5<5  = false
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > maximum) {
				// 3>3 - false
				//5>3 - true
				//878>3 - true
				//333>878 - false
				//74>333 - false
				maximum = arr[i];
				//878
			}
		 }
			System.out.println("largest number in given array is-->" + maximum);
			
	}
}
				
		
 