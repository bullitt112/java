//////////////////////////////////////////////////
// beginning Player.java

import java.util.Scanner;
import java.util.Vector;

// superclass: Player
public class Player {

	Player( ) {	
		
	} // end of constructor: Player
	
	public static void hitOrStay( final String WHO ) {
		
		final short BLACKJACK = ( 21 );
		
		if( WHO == ( "COMPUTER" ) ) {

			int computerScore = ( ComputerPlayer.countCardValues( WHO ) );
			int humanScore = ( HumanPlayer.countCardValues( "HUMAN" ) );				
			// consider hitting only if the player is within range otherwise stay
			if( humanScore <= ( BLACKJACK ) ) {			
					
				// consider hitting only if you have a lower score
				if( computerScore <= ( humanScore )  ) {
					do {
					
						computerScore = ( ComputerPlayer.countCardValues( WHO ) );
						
						if( computerScore <= ( 16 ) ) {
						
							Deck.dealCards( WHO );
							
							computerScore = ( ComputerPlayer.countCardValues( WHO ) );
							
							if( computerScore > ( humanScore ) ) {
								
								break;
								
							} // end of if
						
						} // end of if
						else {
							
							break;
							
						} // end of else
						
					} while( true );

				} // end of if
				
			} // end of if
			
		} // end of if
		else if( WHO == ( "HUMAN" ) ) {
			
			
			Scanner input = ( new Scanner( System.in ) );

			char choice = ( ' ' );
			int humanScore = ( HumanPlayer.countCardValues( WHO ) );
	
			if( humanScore >= ( BLACKJACK ) ) {
			
			} // end of if
			else {
				
				do {
						
					choice = ( ' ' );
					humanScore = ( HumanPlayer.countCardValues( WHO ) );				
					
					System.out.print( "(H)it or (S)tay: ");
					choice = ( Character.toUpperCase( input.next( ).charAt( 0 ) ) );
					
					switch( choice ) {
						
						case 'H':
							Deck.dealCards( WHO );
						
							Game.updateScreen( );
							
							humanScore = ( HumanPlayer.countCardValues( "HUMAN" ) );
							
							if( humanScore > ( BLACKJACK ) ){
								choice = ( 'S' );
								
								break;
							} // end of if
							
						break; // end of 'H'
						
						
						case 'S':
						
						break; // end of 'S'
						
						
						default:
						
						break; // end of default
						
					} // end of statement: switch
		
				} while( choice != ( 'S' ) ); // end of loop: do-while

			} // end of else
			
		} // end of else-if
		else {
			// TODO: error
		}
		
	} // end of method public static void hitOrStay( )

	public static int countCardValues( final String who ) {
		
		Vector<String> tmp_hand = ( new Vector<String>( ) );

		int cardCount = ( 0 );
		
		if( who == ( "COMPUTER" ) ) {

			tmp_hand = ( ( Vector<String> ) ComputerPlayer.my_hand.clone( ) );
			
		} // end of if
		else if( who == ( "HUMAN" ) ) {

			tmp_hand = ( ( Vector<String> ) HumanPlayer.my_hand.clone( ) );

		} // end of else if
		else {
			// TODO: error message
			
		} // end of else
		
		// index through the hand and count values of cards
		for( int i = ( 0 ); i < ( tmp_hand.size( ) ); ++i ) {
						
			if( tmp_hand.elementAt( i ).equals("AS") ) {
				
				if( cardCount >= ( 11 ) ) {
					
					cardCount += ( 1 );
					
				} // end of if
				else {
					
					cardCount += ( 11 );

				} // end of else

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("2S") ) {
				
				cardCount += ( 2 );
				
			} // end of if
			else if( tmp_hand.elementAt( i ).equals("3S") ) {
				
				cardCount += ( 3 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("4S") ) {
				
				cardCount += ( 4 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("5S") ) {
				
				cardCount += ( 5 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("6S") ) {
				
				cardCount += ( 6 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("7S") ) {
				
				cardCount += ( 7 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("8S") ) {
				
				cardCount += ( 8 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("9S") ) {
				
				cardCount += ( 9 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("10S") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("JS") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("QS") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("KS") ) {
				
				cardCount += ( 10 );

			} // end of if	
			else if( tmp_hand.elementAt( i ).equals("AH") ) {
				
				if( cardCount >= ( 11 ) ) {
					
					cardCount += ( 1 );
					
				} // end of if
				else {
					
					cardCount += ( 11 );

				} // end of else

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("2H") ) {
				
				cardCount += ( 2 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("3H") ) {
				
				cardCount += ( 3 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("4H") ) {
				
				cardCount += ( 4 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("5H") ) {
				
				cardCount += ( 5 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("6H") ) {
				
				cardCount += ( 6 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("7H") ) {
				
				cardCount += ( 7 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("8H") ) {
				
				cardCount += ( 8 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("9H") ) {
				
				cardCount += ( 9 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("10H") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("JH") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("QH") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("KH") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("AC") ) {
				
				if( cardCount >= ( 11 ) ) {
					
					cardCount += ( 1 );
					
				} // end of if
				else {
					
					cardCount += ( 11 );

				} // end of else

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("2C") ) {
				
				cardCount += ( 2 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("3C") ) {
				
				cardCount += ( 3 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("4C") ) {
				
				cardCount += ( 4 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("5C") ) {
				
				cardCount += ( 5 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("6C") ) {
				
				cardCount += ( 6 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("7C") ) {
				
				cardCount += ( 7 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("8C") ) {
				
				cardCount += ( 8 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("9C") ) {
				
				cardCount += ( 9 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("10C") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("JC") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("QC") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("KC") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("AD") ) {
				
				if( cardCount >= ( 11 ) ) {
					
					cardCount += ( 1 );
					
				} // end of if
				else {
					
					cardCount += ( 11 );

				} // end of else

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("2D") ) {
				
				cardCount += ( 2 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("3D") ) {
				
				cardCount += ( 3 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("4D") ) {
				
				cardCount += ( 4 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("5D") ) {
				
				cardCount += ( 5 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("6D") ) {
				
				cardCount += ( 6 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("7D") ) {
				
				cardCount += ( 7 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("8D") ) {
				
				cardCount += ( 8 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("9D") ) {
				
				cardCount += ( 9 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("10D") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("JD") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("QD") ) {
				
				cardCount += ( 10 );

			} // end of if
			else if( tmp_hand.elementAt( i ).equals("KD") ) {
				
				cardCount += ( 10 );

			} // end of if
			else {
				// TODO: throw error
			}
		
		} // end of loop: for
		
		return( cardCount );
		
	} // end of method public static int countCardValues( final String who )

} // end of final class Player

// ending Player.java
//////////////////////////////////////////////////