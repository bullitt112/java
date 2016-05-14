import java.util.Scanner;

public final class GuessingGame {

  public static void main( String[] args ) {

    Scanner cinput = ( new Scanner( System.in ) );

    int secretNumber = ( (int)Math.floor( Math.random( ) * 10000 ) );
    int userNumber = ( 0 );

    do {

      System.out.print( "Enter number to guess: " );
      userNumber = ( Integer.parseInt( cinput.nextLine( ) ) );

      if( userNumber < ( secretNumber ) ) {

        System.out.println( "Too low!" );
      }
      else if( userNumber > ( secretNumber ) ) {

        System.out.println( "Too high!" );
      }
      else {

        System.out.println( "Congratulations. You win!" );
      }

    } while( userNumber != ( secretNumber ) );
  }
}
