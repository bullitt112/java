//////////////////////////////////////////////////
// beginning Game.java

// import built-in libraries
import java.util.Scanner;

// class: Game
public final class Game {
	
	public static void displayTitle( ) {
		
		System.out.println( "\n\n\t---Supreme Blackjack 1.0---" );
		System.out.println( "\t___________________________\n\n" );
		
	} // end of method public static void displayTitle( )
	
	public static String determineWinner( ) {
		
		final short BLACKJACK = ( 21 );
		
		int computerScore = ( ComputerPlayer.countCardValues( "COMPUTER" ) );
		int humanScore = ( HumanPlayer.countCardValues( "HUMAN" ) );
		
		String winner = ( "" );
		
		if( humanScore == ( BLACKJACK ) && computerScore == ( BLACKJACK ) ) {
			
			winner = ( "TIE" );
			
		} // end of if
		else if( computerScore > ( BLACKJACK ) ) {
			
			winner = ( "HUMAN" );			
			
		} // end of if
		else if( humanScore > ( BLACKJACK ) ) {
			
			winner = ( "COMPUTER" );			
			
		} // end of if
		else if( computerScore > ( humanScore ) ) {
			
			winner = ( "COMPUTER" );
			
		} // end of else-if
		else if( humanScore > ( computerScore ) ) {
			
			winner = ( "HUMAN" );
			
		} // end of else-if
		else if( humanScore == ( computerScore ) ) {
			
			winner = ( "TIE" );

		} // end of else-if
		else {

			// TODO: error
			
		} // end of else
		
		return( winner );
		
	} // end of method public static void determineWinner
	
	public static void displayWinner( final String who ) {
		
		if( who == ( "COMPUTER" ) ) {
			
			System.out.println( "COMPUTER WINS!" );
			
		} // end of if
		else if( who == ( "HUMAN" ) ) {
			
			System.out.println( "HUMAN WINS!" );
			
		} // end of else-if
		else if( who == ( "TIE" ) ) {
			
			System.out.println( "NOBODY WINS!" );
			
		} // end of else-if
		else {
			
			// TODO: error
			
		} // end of else
		
	} // end of method public static void displayWinner( final String who )
	
	public static void updateScreen( ) {
		
		displayTitle( );
		Table.drawTable( );
		
	} // end of method public static void updateScreen( )

	public static void startGame( ) {
		
		// initialize deck
		Deck deck = ( new Deck( ) );

		// initialize players
		ComputerPlayer c_player = ( new ComputerPlayer( ) );
		HumanPlayer h_player = ( new HumanPlayer( ) );
		
		Table table = ( new Table( ) );

		Scanner input = ( new Scanner( System.in ) );
		char choice = ( ' ' );
		
		boolean isGameOver = ( false );
		
		do {
			deck.shuffleDeck( );
	
			deck.dealCards( "ALL" );
				
			updateScreen( );
			
			HumanPlayer.hitOrStay( "HUMAN" );
		
			updateScreen( );
			
			ComputerPlayer.hitOrStay( "COMPUTER" );
			
			updateScreen( );
			
			displayWinner( determineWinner( ) );

			do {
				
				System.out.print( "\nPlay again? (Y/N): " );
				choice = ( input.next( ).charAt( 0 ) );
				
				choice = Character.toUpperCase( choice );
				
				if( choice == ( 'N' ) ) {
					 
					isGameOver = ( true );
					
					break;
					
				} // end of if
				else if( choice == ( 'Y' ) ) {
					
					isGameOver = ( false );
					
					if( Deck.numberOfCardsInDeck( ) < ( 10 ) ) {
						
						// use a new deck only if the current deck is running low
						deck.initializeDeck( );
					}
					
					// pick up player/computers hands and discard them
					HumanPlayer.resetHand( );
					ComputerPlayer.resetHand( );
					
				} // end of else-if
				else {
					
				} // end of else
				
			} while( choice != ( 'Y' ) && choice != ( 'N' ) ); // end of while
			
		} while( isGameOver == ( false ) );
		
	} // end of method public static void startGame( )
	
} // end of final class: Game

//ending Game.java
//////////////////////////////////////////////////