import java.util.ArrayList;
import java.util.Scanner;

public final class Main {
	
	public static void main( String[] args ) {

		String[] binaryList;
		Scanner cinput = ( new Scanner( System.in ) );
		String binary = ( "" );
		
		Integer number = ( 1 );
		Integer decimal = ( 0 );
		
		System.out.print( "Enter a binary string: " );
		binary = ( cinput.next( ) );
		
		binaryList = ( binary.split( "" ) );
	
		for( int i = ( binaryList.length - ( 1 ) ); i > ( -1 ); --i ) {
		
			if( binaryList[i].equals( "1" ) ) {
				decimal += ( number );
			}
			
			number = ( number * 2 );
		}
		
		System.out.println( binary + " converted to decimal is: " + decimal.toString( ) );
	}
}
