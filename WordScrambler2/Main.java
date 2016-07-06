import java.util.ArrayList;
import java.util.Scanner;

public final class Main {

  public static void main( String[] args ) {

    ArrayList<Integer> usedElements = ( new ArrayList<Integer>( ) );
    Scanner cinput = ( new Scanner( System.in ) );
    String unscrambled = ( "" );
    String scrambled = ( "" );
    int randNum = ( 0 );

    System.out.print( "Enter a word to scramble: " );
    unscrambled = ( cinput.next( ) );

    for( int i = ( 0 ); i < ( unscrambled.length( ) ); ++i ) {

      randNum = ( (int)Math.floor( Math.random( ) * unscrambled.length( ) ) );
      while( usedElements.contains( randNum ) ) {

        randNum = ( ( int) Math.floor( Math.random( ) * unscrambled.length( ) ) );
      }

      scrambled += ( unscrambled.charAt( randNum ) );
      usedElements.add( randNum );
    }

    System.out.println( "Scrambled Word: " + scrambled );
  }
}
