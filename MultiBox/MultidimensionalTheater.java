/*  Author: Paraskevakos G. | 2017
*   !COMMENTS ARE IN GREEK!
*/

package MultiBox;

public class MultidimensionalTheater 
{
	/**
	 *private attributes
	**/	
	private int row ;		// óåéñÝò
	private int column ;	//óôåßëåò
	private int [][] seatTest ;	//áíáðáñÜóôáóç èåÜôñïõ ìå ðïëõäéÜóôáôï ðßíáêá
	
	
	/**
	 *Constructor
	**/
	public MultidimensionalTheater(int x , int y)
	{
		// Áñ÷éêïðïßçóç ðïëõäéÜóôáôïõ ðßíáêá èåÜôñïõ seatTest [][]
		seatTest = new int [ 4 ][ ];	
		
		seatTest[ 0 ] = new int[ 2 ];
		
		seatTest[ 1 ] = new int[ 4 ];
		
		seatTest[ 2 ] = new int[ 6 ];
		
		seatTest[ 3 ] = new int[ 8 ];
		
		/**åéêïíéêÞ áíáðáñÜóôáóç seatTest[][]
		 *int [][] seatTest = {
		 *		    		    {0, 0},{0, 1},
		 *	    	     {1, 0},{1, 1},{1, 2},{1, 3},
		 *   	  {2, 0},{2, 1},{2, 2},{2, 3},{2, 4},{2, 5},
		 * {3, 0},{3, 1},{3, 2},{3, 3},{3, 4},{3, 5},{3, 6},{3, 7}
		 *};
		**/
		
		//Áñ÷éêïðïéïýìå ôéò èÝóåéò áíÜ óåéñÜ
		for (int j = 0; j < seatTest[ 0 ].length; j++) 
		{	
			row = 0; // ç 1ç óåéñÜ seatTest [ 0 ][]
			seatTest[ row ][ j ] = 0;	//0 åßíáé åëåýèåñç 1 åßíáé êñáôçìÝíç
		
			for (int k = 0; k < seatTest[ 1 ].length; k++) 
			{
				row = 1; // ç 2ç óåéñÜ seatTest [ 1 ][]
				seatTest[ row ][ k ] = 0;	//0 åßíáé åëåýèåñç 1 åßíáé êñáôçìÝíç
				
				for (int q = 0; q < seatTest[ 2 ].length; q++) 
				{
					row = 2; //ç 3ç óåéñÜ seatTest [ 2 ][]
					seatTest[ row ][ q ] = 0;	//0 åßíáé åëåýèåñç 1 åßíáé êñáôçìÝíç
					
					for (int m = 0; m < seatTest[ 3 ].length; m++) 
					{
						row = 3; //ç 4ç óåéñÜ seatTest [ 3 ][]
						seatTest[ row ][ m ] = 0;	//0 åßíáé åëåýèåñç 1 åßíáé êñáôçìÝíç
					}	//end 4th for
				}	//end 3rd for
			}	//end 2nd for
		}	//end 1st for
	}	//end constructor MultidimensionalTheater

	
	/**
	 *private interfaces
	**/
	private boolean isUnavailable (int x, int y)	//åëÝã÷åé áí ç èÝóç åßíáé êñáôçìÝíç
	{
		
		return seatTest[ x ][ y ] == 1 ? true : false ;
	}	//end method isUnavailable
	
	private boolean isAvailable (int x, int y)	//åëÝã÷åé áí ç èÝóç åßíáé åëÝõèåñç
	{
		return seatTest[ x ][ y ] == 0 ? true : false ;
	}	//end method isAvailable
	
	
	
	/**
	 *public interfaces
	**/
	public boolean makeBook(int x, int y)	// êÜíåé êñÜôçóç ôçò èÝóçò
	{
		if (isAvailable(x, y))
		{
			seatTest[ x ][ y ]=1;
			return true ;
		}
		else 
		{
			System.out.printf("H ÈÝóç %d, %d  %s\n" , x , y, "åßíáé Þäç ðéáóìÝíç!");// To ìÞíõìá èá åìöáíéóôåß ìüíï óôçí main MultiTheater 
			return false ;															// ðïõ åëÝã÷åé ôçí ïñèüôçôá ôçò MultidimensionalTheater
		}
	}	//end method makeBook	
	
	public boolean makeFree (int x, int y) // áðïäåóìåýåé ôç èÝóç
	{
		if (isUnavailable(x, y))
		{
			seatTest[ x ][ y ]=0;
			return true;
		}
		else
		{
			System.out.printf("H ÈÝóç %d, %d  %s\n" , x , y, "åßíáé Þäç åëåýèåñç!");// To ìÞíõìá èá åìöáíéóôåß ìüíï óôçí main ôçò MultiTheaterTest
			return false;															// ðïõ åëÝã÷åé ôçí ïñèüôçôá ôçò MultidimensionalTheater
		}
	}	//end method makeFree
	
	
	public void theaterDisplay()	// åìöáíßæåé ôçí èÝóç & ôçí êáôÜóôáóÞ ôçò , äåóìåõåìÝíç Þ åëÝõèåñç
	{
		
		for (column = 0; column < seatTest[ 0 ].length; column++)	//áðü ôçí 1ç óåéñÜ
			{
				System.out.printf("ÈÝóç %d, %d : " , 0 , column);
				System.out.printf("%s\n", isUnavailable(0, column) ? "KáôåéëçììÝíç" : "Åëåýèåñç" );
			}
		for (column = 0; column < seatTest[ 1 ].length; column++)	//áðü ôçí 2ç óåéñÜ
			{
				System.out.printf("ÈÝóç %d, %d : " , 1 , column);
				System.out.printf("%s\n", isUnavailable(1, column) ? "KáôåéëçììÝíç" : "Åëåýèåñç" );
			}
		for (column = 0; column < seatTest[ 2 ].length; column++)	//áðü ôçí 3ç óåéñÜ
			{
				System.out.printf("ÈÝóç %d, %d : " , 2 , column);
				System.out.printf("%s\n", isUnavailable(2, column) ? "KáôåéëçììÝíç" : "Åëåýèåñç" );
			}
		for (column = 0; column < seatTest[ 3 ].length; column++)	//áðü ôçí 4ç óåéñÜ
			{
				System.out.printf("ÈÝóç %d, %d : " , 3 , column);
				System.out.printf("%s\n", isUnavailable(3, column) ? "KáôåéëçììÝíç" : "Åëåýèåñç" );
			}
	}	//end method theaterDisplay
	
}	//end class MultidimensionalTheater
