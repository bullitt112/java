//////////////////////////////////////////////////
//beginning ComputerPlayer.java

// import built-in libraries
import java.util.Vector;

//subclass: ComputerPlayer
public final class ComputerPlayer extends Player {

	static Vector<String> my_hand;
	
	ComputerPlayer( ) {
		my_hand = ( new Vector<String>( ) );	

		
	} // end of constructor: ComputerPlayer
	
	public static void resetHand( ) {
		
		if( !my_hand.isEmpty( ) ) {
			
			my_hand.removeAllElements( );
			
		} // end of if
		
	} // end of method public static void resetHand( )	

} // end of final class ComputerPlayer

//ending ComputerPlayer.java
//////////////////////////////////////////////////