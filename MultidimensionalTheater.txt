package MultiBox;

public class MultidimensionalTheater 
{
	/**
	 *private attributes
	**/	
	private int row ;		// σειρές
	private int column ;	//στείλες
	private int [][] seatTest ;	//αναπαράσταση θεάτρου με πολυδιάστατο πίνακα
	
	
	/**
	 *Constructor
	**/
	public MultidimensionalTheater(int x , int y)
	{
		// Αρχικοποίηση πολυδιάστατου πίνακα θεάτρου seatTest [][]
		seatTest = new int [ 4 ][ ];	
		
		seatTest[ 0 ] = new int[ 2 ];
		
		seatTest[ 1 ] = new int[ 4 ];
		
		seatTest[ 2 ] = new int[ 6 ];
		
		seatTest[ 3 ] = new int[ 8 ];
		
		/**εικονική αναπαράσταση seatTest[][]
		 *int [][] seatTest = {
		 *		    		    {0, 0},{0, 1},
		 *	    	     {1, 0},{1, 1},{1, 2},{1, 3},
		 *   	  {2, 0},{2, 1},{2, 2},{2, 3},{2, 4},{2, 5},
		 * {3, 0},{3, 1},{3, 2},{3, 3},{3, 4},{3, 5},{3, 6},{3, 7}
		 *};
		**/
		
		//Αρχικοποιούμε τις θέσεις ανά σειρά
		for (int j = 0; j < seatTest[ 0 ].length; j++) 
		{	
			row = 0; // η 1η σειρά seatTest [ 0 ][]
			seatTest[ row ][ j ] = 0;	//0 είναι ελεύθερη 1 είναι κρατημένη
		
			for (int k = 0; k < seatTest[ 1 ].length; k++) 
			{
				row = 1; // η 2η σειρά seatTest [ 1 ][]
				seatTest[ row ][ k ] = 0;	//0 είναι ελεύθερη 1 είναι κρατημένη
				
				for (int q = 0; q < seatTest[ 2 ].length; q++) 
				{
					row = 2; //η 3η σειρά seatTest [ 2 ][]
					seatTest[ row ][ q ] = 0;	//0 είναι ελεύθερη 1 είναι κρατημένη
					
					for (int m = 0; m < seatTest[ 3 ].length; m++) 
					{
						row = 3; //η 4η σειρά seatTest [ 3 ][]
						seatTest[ row ][ m ] = 0;	//0 είναι ελεύθερη 1 είναι κρατημένη
					}	//end 4th for
				}	//end 3rd for
			}	//end 2nd for
		}	//end 1st for
	}	//end constructor MultidimensionalTheater

	
	/**
	 *private interfaces
	**/
	private boolean isUnavailable (int x, int y)	//ελέγχει αν η θέση είναι κρατημένη
	{
		
		return seatTest[ x ][ y ] == 1 ? true : false ;
	}	//end method isUnavailable
	
	private boolean isAvailable (int x, int y)	//ελέγχει αν η θέση είναι ελέυθερη
	{
		return seatTest[ x ][ y ] == 0 ? true : false ;
	}	//end method isAvailable
	
	
	
	/**
	 *public interfaces
	**/
	public boolean makeBook(int x, int y)	// κάνει κράτηση της θέσης
	{
		if (isAvailable(x, y))
		{
			seatTest[ x ][ y ]=1;
			return true ;
		}
		else 
		{
			System.out.printf("H Θέση %d, %d  %s\n" , x , y, "είναι ήδη πιασμένη!");// To μήνυμα θα εμφανιστεί μόνο στην main MultiTheater 
			return false ;															// που ελέγχει την ορθότητα της MultidimensionalTheater
		}
	}	//end method makeBook	
	
	public boolean makeFree (int x, int y) // αποδεσμεύει τη θέση
	{
		if (isUnavailable(x, y))
		{
			seatTest[ x ][ y ]=0;
			return true;
		}
		else
		{
			System.out.printf("H Θέση %d, %d  %s\n" , x , y, "είναι ήδη ελεύθερη!");// To μήνυμα θα εμφανιστεί μόνο στην main της MultiTheaterTest
			return false;															// που ελέγχει την ορθότητα της MultidimensionalTheater
		}
	}	//end method makeFree
	
	
	public void theaterDisplay()	// εμφανίζει την θέση & την κατάστασή της , δεσμευεμένη ή ελέυθερη
	{
		
		for (column = 0; column < seatTest[ 0 ].length; column++)	//από την 1η σειρά
			{
				System.out.printf("Θέση %d, %d : " , 0 , column);
				System.out.printf("%s\n", isUnavailable(0, column) ? "Kατειλημμένη" : "Ελεύθερη" );
			}
		for (column = 0; column < seatTest[ 1 ].length; column++)	//από την 2η σειρά
			{
				System.out.printf("Θέση %d, %d : " , 1 , column);
				System.out.printf("%s\n", isUnavailable(1, column) ? "Kατειλημμένη" : "Ελεύθερη" );
			}
		for (column = 0; column < seatTest[ 2 ].length; column++)	//από την 3η σειρά
			{
				System.out.printf("Θέση %d, %d : " , 2 , column);
				System.out.printf("%s\n", isUnavailable(2, column) ? "Kατειλημμένη" : "Ελεύθερη" );
			}
		for (column = 0; column < seatTest[ 3 ].length; column++)	//από την 4η σειρά
			{
				System.out.printf("Θέση %d, %d : " , 3 , column);
				System.out.printf("%s\n", isUnavailable(3, column) ? "Kατειλημμένη" : "Ελεύθερη" );
			}
	}	//end method theaterDisplay
	
}	//end class MultidimensionalTheater
