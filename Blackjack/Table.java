//////////////////////////////////////////////////
// beginning Table.java

// class: Table
public final class Table {

	public static void drawTable( ) {
		
		System.out.println( "\t***************************" );
		System.out.println( "\tPlayer: 1: Computer" );

		System.out.print( "\t" );
		
		for( int i = ( 0 ); i < ( ComputerPlayer.my_hand.size( ) ); ++i ) {
			System.out.print( ComputerPlayer.my_hand.elementAt( i ) + " " );
		} // end of loop: for
		
		System.out.println( "\n\t***************************\n\n" );		
		
		System.out.println( "\t***************************" );
		System.out.println( "\tPlayer: 2: Human" );

		System.out.print( "\t" );
		
		for( int i = ( 0 ); i < ( HumanPlayer.my_hand.size( ) ); ++i ) {
			System.out.print( HumanPlayer.my_hand.elementAt( i ) + " " );
		} // end of loop: for
		
		System.out.println( "\n\t***************************" );		

	} // end of method public static void drawTable( )

} // end of final class: Table

//ending Table.java
//////////////////////////////////////////////////