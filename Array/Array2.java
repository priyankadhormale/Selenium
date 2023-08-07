package Array;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {

		char C1[] = new char[5]; // 0 to 4
		C1[0] = 'A';
		C1[1] = 'P';
		C1[2] = 'V';
		C1[3] = '2';
		C1[4] = 'D';
		// C1[5] = 'Z'; //ArrayIndexOutOfBoundsException
		System.out.println(C1.length);
		for (int i = 0; i < C1.length; i++) {
			System.out.println(" " + C1[i]);
		}

		System.out.println();
		Arrays.sort(C1);

		for (int i = 0; i < C1.length; i++) {
			System.out.println(" " + C1[i]);
		}
		// String str[] = new String[-5] //No-NegativeArraySizeException

		String str[] = new String[5];

		str[0] = "Akash";
		str[1] = "@%&*";
		str[2] = "Akash";
		str[3] = "Vishal";
		str[4] = "594422"; //

		System.out.println(str[2]);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		System.out.println();

		boolean[] B1 = new boolean[3];
		B1[0] = true;
		B1[1] = true;
		B1[2] = false;
		// B1[3] = "Test"; unresolved compilation problem

		System.out.println(B1[1]);
		for (int i = 0; i < B1.length; i++) {
			System.out.println(B1[i]);
		}

		System.out.println();

		double D1[] = new double[3];
		double D2[] = new double[2];
		D1[0] = 11.45d;
		D1[1] = 33.11;
		D1[2] = 33.22;
		System.out.println(D1[0]);

		for (int i = 0; i < D1.length; i++) {
			System.out.println(D1[i]);
		}

		Object obj[] = new Object[6]; // nonsimilar //Hetrogeneus datatype
		obj[0] = "Priya";
		obj[1] = 'V';
		obj[2] = "#$@%^&";
		obj[3] = 15551;
		obj[4] = true;
		obj[5] = 50.41f;
		System.out.println(obj.length);

		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}

}
