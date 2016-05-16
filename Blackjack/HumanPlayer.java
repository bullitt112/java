//////////////////////////////////////////////////
//beginning HumanPlayer.java

// import built-in libraries
import java.util.Vector;

//subclass: Player
public final class HumanPlayer extends Player {

	static Vector<String> my_hand;
		
	HumanPlayer( ) {
		my_hand = ( new Vector<String>( ) );	

		
	} // end of constructor: HumanPlayer
	
	public static void resetHand( ) {
		
		if( !my_hand.isEmpty( ) ) {
			
			my_hand.removeAllElements( );
			
		} // end of if
		
	} // end of method public static void resetHand( )
	
} // end of final class HumanPlayer

//ending HumanPlayer.java
//////////////////////////////////////////////////