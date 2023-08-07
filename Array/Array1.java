package Array;

public class Array1 {

	public static void main(String[] args) {

		// Array is a collection of similar type of element/values
		// we can store only fixed set element in java array
		// Array is index based and first element of the array at 0th index and last
		// index n-1(array name)

		// System.out.println(i1);
		// System.out.println(i2);

		// Array declaration
		// syntax
		// datatype arrayname[] = new datatype[sizeof array]

		int i1 = 10;
		int arr[] = new int[10];

		// 2.Array initialization
		// sytax - arrayname[indexnumber]

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;

		// arr[20]= 300; -->ArrayIndexOutOfBoundsException

		// Array usage

		System.out.println(arr.length); // 10
		System.out.println();

		System.out.println("Index 6 =" + arr[6]); // 7
		System.out.println("Index 9 =" + arr[9]); // 10
		// System.out.println("Index -"+arr[2]); //-3

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
