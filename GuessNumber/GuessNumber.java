import java.util.Scanner;

public final class GuessNumber {

  public static void main( String[] args ) throws Exception {

    int randomNumber = ( new Integer( (int)Math.floor( Math.random( ) * 1000 ) ) );
    int userNumber = ( new Integer( 0 ) );
    Scanner input = ( new Scanner( System.in ) );

    int numOfTries = ( new Integer( 0 ) );

    try {

      do {

        ++numOfTries;

        System.out.print( "\nEnter a number to guess: " );
        userNumber = ( input.nextInt( ) );

        if( userNumber == ( randomNumber ) ) {

          System.out.println( "You got it! Congratulations" );
          System.out.println( "Number of tries was " + numOfTries );
        }
        else if( userNumber < ( randomNumber ) ) {

          System.out.println( "Go higher!" );
        }
        else {

          System.out.println( "Go lower!" );
        }

      } while( userNumber != ( randomNumber ) );
    }
    catch( Exception e ) {

      System.out.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }
    finally {

      input.close( );
    }
  }
}
