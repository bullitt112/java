import java.util.ArrayList;
import java.util.Scanner;

public final class Main {

  public static void main( String[] args ) {

    ArrayList<Integer> usedElements = ( new ArrayList<Integer>( ) );
    Scanner cinput = ( new Scanner( System.in ) );
    String unscrambled = ( "" );
    String scrambled = ( "" );
    int randNum = ( 0 );

<<<<<<< HEAD
=======

>>>>>>> baad0de8ef3edd3c566d26e3556e80eec112c49f
    System.out.print( "Enter a word to scramble: " );
    unscrambled = ( cinput.next( ) );

    for( int i = ( 0 ); i < ( unscrambled.length( ) ); ++i ) {

      randNum = ( (int)Math.floor( Math.random( ) * unscrambled.length( ) ) );
      while( usedElements.contains( randNum ) ) {
<<<<<<< HEAD

        randNum = ( ( int) Math.floor( Math.random( ) * unscrambled.length( ) ) );
      }
=======
        randNum = ( (int)Math.floor( Math.random( ) * unscrambled.length( ) ) );
      } 
>>>>>>> baad0de8ef3edd3c566d26e3556e80eec112c49f

      scrambled += ( unscrambled.charAt( randNum ) );
      usedElements.add( randNum );
    }

    System.out.println( "Scrambled Word: " + scrambled );
  }
}
