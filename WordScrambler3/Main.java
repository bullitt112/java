import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main( String[] args ) {
		
		// DECLARE ALL THE ARRAYS
		ArrayList<Integer> usedElements = ( new ArrayList<Integer>( ) );
		ArrayList<String> encryptedWords = ( new ArrayList<String>( ) );
		String[] allWords;
		
		// DECLARE ALL THE STANDARD VARIABLES
		Scanner input = ( new Scanner( System.in ) );
		String word = ( "" );
		String encryptedWord = ( "" );
		int randNum = ( 0 );
				
		// ASK FOR INPUT
		System.out.print( "Enter a sentence to scramble: " );
		
		// GET INPUT
		word = input.nextLine( );

		// SPLIT THE STRING INTO ARRAY
		allWords = word.split( " " );
				
		// GO THROUGH ALL WORDS
		for( int i = ( 0 ); i < allWords.length; ++i ) {
			
			// RESET VARIABLES HERE
			usedElements.clear( );
			encryptedWord = ( "" );

			// GO THROUGH EACH INDIVIDUAL CHARACTER WITHIN THE WORD
			for( int x = ( 0 ); x < allWords[i].length( ); ++x ) {
			
				// GENERATE A RANDOM NUMBER
				randNum = (int)Math.floor( Math.random( ) * allWords[i].length( ) );
	
				// MAKE SURE THE RANDOM NUMBER IS UNIQUE
				while( usedElements.contains( randNum ) ) {
					randNum = (int)Math.floor( Math.random( ) * allWords[i].length( ) );
				}
				
				// BUILD A RANDOM STRING HERE
				encryptedWord += allWords[i].charAt(randNum);
				
				// LOG WHICH RANDOM NUMBER WAS USED
				usedElements.add( randNum );

			}
			
			// ADD THE ENCRYPTED WORD TO THE ARRAY
			encryptedWords.add( encryptedWord );
			
		}
		
		// RESET VARIABLES
		encryptedWord = ( "" );
		
		// GO THROUGH ALL THE ENCRYPTED WORDS
		for( int i = ( 0 ); i < ( encryptedWords.size( ) ); ++i ) {
			
			// BUILD FINAL STRING WITH ENCRYPTED WORD
			encryptedWord += encryptedWords.get( i );
			
			// SEPARATE EACH WORD WITH A SPACE
			encryptedWord += " ";
		}

		// DISPLAY THE ENCRYPTED SENTENCE
		System.out.println( "Encrypted Sentence: " + encryptedWord );
		
	}
}
