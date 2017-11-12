/*  
*Author: Paraskevakos G. | 2017 
*/
package MultiBox;

public class MultiTheaterTest 
{
	public static void main (String[]args)
	{
		//Äçìéïõñãßá ogject myTestSeats
		MultidimensionalTheater myTestSeats = new MultidimensionalTheater(4, 8);

		//êëÞóç ìåèüäùí
		myTestSeats.makeBook(1, 1);
		myTestSeats.makeBook(1, 2);
		myTestSeats.makeBook(3, 6);
		myTestSeats.makeFree(3, 6);
		myTestSeats.makeBook(1, 1);
		myTestSeats.makeFree(2, 3);
		myTestSeats.theaterDisplay();
	} // end main
} // end class MultiTheaterTest 
