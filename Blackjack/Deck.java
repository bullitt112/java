//////////////////////////////////////////////////
// beginning Deck.java

// import built-in
import java.util.Vector;

// class: Deck
public final class Deck {
	
	// main deck (52 cards)
	static Vector<String> my_deck;

	// constructor: Deck
	public Deck( ) {
		my_deck = ( new Vector<String>( ) );
			
		// initialize values for all 52 cards (no jokers)
		initializeDeck( );
		
	} // end of constructor Deck
	
	public static int numberOfCardsInDeck( ) {
		
		return( my_deck.size( ) );
		
	} // end of method public static short numberOfCardsInDeck

	public static void initializeDeck( )  {
		
		if( !my_deck.isEmpty( ) ) {
			
			my_deck.removeAllElements( );
			
		} // end of if
		
		// initialize all the spade cards
		my_deck.addElement( new String( "AS" ) );  // card # 01
		my_deck.addElement( new String( "2S" ) );  // card # 02
		my_deck.addElement( new String( "3S" ) );  // card # 03
		my_deck.addElement( new String( "4S" ) );  // card # 04
		my_deck.addElement( new String( "5S" ) );  // card # 05
		my_deck.addElement( new String( "6S" ) );  // card # 06
		my_deck.addElement( new String( "7S" ) );  // card # 07
		my_deck.addElement( new String( "8S" ) );  // card # 08
		my_deck.addElement( new String( "9S" ) );  // card # 09
		my_deck.addElement( new String( "10S" ) ); // card # 10
		my_deck.addElement( new String( "JS" ) );  // card # 11
		my_deck.addElement( new String( "QS" ) );  // card # 12
		my_deck.addElement( new String( "KS" ) );  // card # 13
		
		// initialize all the heart cards
		my_deck.addElement( new String( "AH" ) );  // card # 14
		my_deck.addElement( new String( "2H" ) );  // card # 15
		my_deck.addElement( new String( "3H" ) );  // card # 16
		my_deck.addElement( new String( "4H" ) );  // card # 17
		my_deck.addElement( new String( "5H" ) );  // card # 18
		my_deck.addElement( new String( "6H" ) );  // card # 19
		my_deck.addElement( new String( "7H" ) );  // card # 20
		my_deck.addElement( new String( "8H" ) );  // card # 21
		my_deck.addElement( new String( "9H" ) );  // card # 22
		my_deck.addElement( new String( "10H" ) ); // card # 23
		my_deck.addElement( new String( "JH" ) );  // card # 24
		my_deck.addElement( new String( "QH" ) );  // card # 25
		my_deck.addElement( new String( "KH" ) );  // card # 26
		
		// initialize all the club cards
		my_deck.addElement( new String( "AC" ) );  // card # 27
		my_deck.addElement( new String( "2C" ) );  // card # 28
		my_deck.addElement( new String( "3C" ) );  // card # 29
		my_deck.addElement( new String( "4C" ) );  // card # 30
		my_deck.addElement( new String( "5C" ) );  // card # 31
		my_deck.addElement( new String( "6C" ) );  // card # 32
		my_deck.addElement( new String( "7C" ) );  // card # 33
		my_deck.addElement( new String( "8C" ) );  // card # 34
		my_deck.addElement( new String( "9C" ) );  // card # 35
		my_deck.addElement( new String( "10C" ) ); // card # 36
		my_deck.addElement( new String( "JC" ) );  // card # 37
		my_deck.addElement( new String( "QC" ) );  // card # 38
		my_deck.addElement( new String( "KC" ) );  // card # 39

		// initialize all the diamond cards
		my_deck.addElement( new String( "AD" ) );  // card # 40
		my_deck.addElement( new String( "2D" ) );  // card # 41
		my_deck.addElement( new String( "3D" ) );  // card # 42
		my_deck.addElement( new String( "4D" ) );  // card # 43
		my_deck.addElement( new String( "5D" ) );  // card # 44
		my_deck.addElement( new String( "6D" ) );  // card # 45
		my_deck.addElement( new String( "7D" ) );  // card # 46
		my_deck.addElement( new String( "8D" ) );  // card # 47
		my_deck.addElement( new String( "9D" ) );  // card # 48
		my_deck.addElement( new String( "10D" ) ); // card # 49
		my_deck.addElement( new String( "JD" ) );  // card # 50
		my_deck.addElement( new String( "QD" ) );  // card # 51
		my_deck.addElement( new String( "KD" ) );  // card # 52

	} // end of method: void initializeDeck()
	
	public static void shuffleDeck( ) {
		
		// create a new vector to fill up the random cards
		Vector<String> tmp_deck = ( new Vector<String>( ) );
		int randomNumber = ( 0 );
	
		// index through all the cards
		while( !( my_deck.isEmpty( ) ) ) {
			
			// generate the random number
			randomNumber = ( ( int ) Math.floor(Math.random( ) * my_deck.size( ) ) );
			
			if( my_deck.contains( my_deck.elementAt( randomNumber ) ) ) {
				//System.out.println("Random Number: " + randomNumber + ". Card chosen is: " + my_deck.elementAt( randomNumber) );

				tmp_deck.addElement( my_deck.elementAt( randomNumber ) );
				
				my_deck.removeElementAt( randomNumber );
				
			} // end of if
			
		} // end of loop: while
			
		// copying the shuffled deck back to the main deck
		my_deck = ( ( Vector<String> ) tmp_deck.clone( ) );

	} // end of method void shuffleDeck( )
	
	public static void dealCards( final String who ) {
		
		if( who.equals( "ALL" ) ) {
			
			ComputerPlayer.my_hand.addElement( new String( my_deck.elementAt( 0 )  ) );
			my_deck.removeElementAt( 0 );

			HumanPlayer.my_hand.addElement( new String( my_deck.elementAt( 0 )  ) );
			my_deck.removeElementAt( 0 );
			
			ComputerPlayer.my_hand.addElement( new String( my_deck.elementAt( 0 )  ) );
			my_deck.removeElementAt( 0 );
		
			HumanPlayer.my_hand.addElement( new String( my_deck.elementAt( 0 )  ) );
			my_deck.removeElementAt( 0 );
			
		} // end of if
		else if( who.equals( "COMPUTER" ) ) {
			
			ComputerPlayer.my_hand.addElement( new String( my_deck.elementAt( 0 )  ) );
			my_deck.removeElementAt( 0 );
						
		} // end of else if
		else if( who.equals( "HUMAN" ) ) {
			
			HumanPlayer.my_hand.addElement( new String( my_deck.elementAt( 0 )  ) );
			my_deck.removeElementAt( 0 );
			
		} // end of else if
		
	} // end of method public static void dealCards( String who, int number )
	
	public static void displayDeck( ) {
		System.out.println("Vector Size: " + my_deck.size( ) + '\n');
		
		for( int i = ( 0 ); i < ( my_deck.size( ) ); ++i ) {
			System.out.println( "Card # " + ( i + 1 ) + ": " + my_deck.elementAt( i ) );
			
		} // end of loop: for
		
	} // end of method: void displayDeck( )
	
} // end of final class: Deck

// ending Deck.java
//////////////////////////////////////////////////