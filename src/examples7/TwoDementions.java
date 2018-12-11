package examples7;

public class TwoDementions {

	public static void main(String[] args) {
		// basic set up 
		//int table [] [] = new int [10][20];
		int t,i;
		int table [] [] = new int[3][4];
		
		for (t=0; t< 3;++t) {
			for (i=0; i<4; ++i) {
				table [t] [i] = (t*4)+i+1;
				System.out.print(table [t][i] +" ");
			}
			System.out.println();
		}
      int  seqealList [][] = new int [3][];
		seqealList [0] = new int [42];
		seqealList [1] = new int[10];
		seqealList [2] = new int [49];
       seqealList [0][0] = 12;
       
       
       String movieList [][]= new String [5][];
       
       movieList[0] = new String[5];
       
       movieList [0][0] = "Maze Runner ";
       movieList [0][1] = "Scorch Trails ";
       movieList[0][2] = "Death Cures ";
       movieList [0][3] = "Kill Order ";
       movieList [0][4] = "Fever Code ";
       
       
       for( i =0; i<5;i++) {
    	   System.out.print(movieList[0][i]);
       }
     
       
       
       
       
       
	}

}
