import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public final class CalcGrade {

  private static char calcGrade( double p ) {

    char letter = ( ' ' );

    if( p >= 90 && ( p <= 100 ) ) {

      letter = ( 'A' );
    }
    else if( p >= 80 && ( p <= 89 ) ) {

      letter = ( 'B' );
    }
    else if( p >= 70 && ( p <= 79 ) ) {

      letter = ( 'C' );
    }
    else if( p >= 60 && ( p <= 69 ) ) {

      letter = ( 'D' );
    }
    else if( p >= 0 && ( p <= 59 ) ) {

      letter = ( 'F' );
    }
    else {

      letter = ( '?' );
    }

    return( letter );
  }

  public static void main( String[] args ) {

    InputStreamReader isr = ( new InputStreamReader( System.in ) );
    BufferedReader br = ( new BufferedReader( isr ) );
    double perc = ( 0 );

    try {

      System.out.print( "Enter percentage: " );
      perc = ( Float.parseFloat( br.readLine( ) ) );

      System.out.println( "Your grade is: " + calcGrade( perc ) );
    }
    catch( IOException e ) {

      System.err.println( e.getMessage( ) );
      e.printStackTrace( );
    }

    br.close( );
  }
}
