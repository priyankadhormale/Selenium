package Array;

public class Array3 {

	public static void main(String[] args) {
		
		String S1[] = new String[3];
		//	R C
		String S2[] [] =new String[4][5];
		
		System.out.println(S2.length);    //Total no rows
        System.out.println(S2[2].length);   //Total no columns
        System.out.println();
       
        //row and col
        
        //First Row
        S2[0][0] = "A1";
        S2[0][1] = "A2";
        S2[0][2] = "A3";
        S2[0][3] = "A4";
        S2[0][4] = "A5";
      System.out.println(S2[0][4]);
        System.out.println();
        
        //Second Row
        S2[1][0] = "B1";
        S2[1][1] = "B2";
        S2[1][2] = "B3";
        S2[1][3] = "B4";
        S2[1][4] = "B5";
     System.out.println(S2[1][3]);
     System.out.println();
     
     //Third Row
     S2[2][0] = "C1";
     S2[2][1] = "C2";
     S2[2][2] = "C3";
     S2[2][3] = "C4";
     S2[2][4] = "C5";
    System.out.println(S2[2][4]);
    System.out.println();
    
    //Fourth Row
    S2[3][0] = "D1";
    S2[3][1] = "D2";
    S2[3][2] = "D3";
    S2[3][3] = "D4";
    S2[3][4] = "D5";
    System.out.println(S2[3][1]);
    System.out.println();
    
    //0<4 - true
    //1<4 - true
    for(int row=0 ; row<S2.length ; row++)  {   //row
    	System.out.println();
    	//0<5 = true
    	//1<5 = true
    	//2<5 = true
    	//3<5 = true
    	//4<5 = true
    	//5<5 = false
    	
    	for(int col=0 ; col<S2[2].length ; col++) {
    		System.out.println(S2[row][col] + " ");
    		System.out.println();
    	}
    	
    }
	
	
	}

}
