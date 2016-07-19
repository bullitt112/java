import java.util.ArrayList;
import java.util.Scanner;

public final class Main {

	public static void main( String[] args ) {
		
		Integer TRIES = ( 7 );
		Integer numTries = ( 0 );
		
		String[] secretCharacters;
		Scanner cinput = ( new Scanner( System.in ) );
		String secretWord = ( "" );
		String hint = ( "" );
		String userWord = ( "" );

		
		boolean isWin = ( false );
		boolean isAsterisk = ( true );
		
		System.out.println( "Welcome to Hangman!\n" );
		
		System.out.print( "P1: Enter a secret word: " );
		secretWord = ( cinput.nextLine( ) );
		
		secretCharacters = ( secretWord.split( "" ) );
		
		System.out.print( "P1: Enter a hint: " );
		hint = ( cinput.nextLine( ) );
		
		System.out.println( "Welcome to Hangman v1.0!\n" );

	
		for( int i = ( 0 ); i < ( TRIES ); ++i ) {
			System.out.println( "\nTRIES LEFT:\t" + ( TRIES - i ) );
			System.out.print( "SECRET WORD:\t" );
			for( int z = ( 0 ); z < ( secretCharacters.length ); ++z ) {
				if( !secretCharacters[z].equals( "*" ) ) {
					System.out.print( '*' );
				}
				else {
					System.out.print( secretWord.charAt( z ) );
				}
			}

			System.out.println( "\nHINT:\t\t" + hint );
			System.out.print( "\nP2: Guess the word: " );
			userWord = ( cinput.next( ) );
			
			if( userWord.equals( secretWord ) ) {
				isWin = ( true );
				break;
			}
			else if( userWord.length( ) > ( 1 ) ) {
				System.out.println( "\nYou can only enter 1 character at a time: " );
				continue;
			}
			
			for( int n = ( 0 ); n < ( secretCharacters.length ); ++n ) {
				if( secretCharacters[n].equals( userWord ) ) {
					secretCharacters[n] = ( "*" );
				}
			}

			isAsterisk = ( true );
			for( int r = ( 0 ); r < ( secretCharacters.length ); ++r ) {
				if( !secretCharacters[r].equals( "*" ) ) {
					isAsterisk = ( false );
				}
			}
			
			if( isAsterisk == ( true ) ) {
				isWin = ( true );
				break;				
			}
		}
		
		if( isWin ) {
			System.out.println( "\nCongratulations. The word is \"" + secretWord + "\". You win!" );
		}
		else {
			System.out.println( "Sorry you lose. The secret word was \"" + secretWord + "\"" );
		}
	}
}
