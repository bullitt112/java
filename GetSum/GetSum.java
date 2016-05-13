import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public final class GetSum {

  private static int getSum( ) throws IOException {

    InputStreamReader isr = ( new InputStreamReader( System.in ) );
    BufferedReader br = ( new BufferedReader( isr ) );

    int count = ( 0 );
    int num = ( 0 );
    int sum = ( 0 );

    try {
      System.out.print( "Enter how many numbers: " );
      count = ( Integer.parseInt( br.readLine( ) ) );      

      for( int i = ( 0 ); i < ( count ); ++i ) {

        System.out.print( "Enter a number: " );
        num = ( Integer.parseInt( br.readLine( ) ) );

        sum += ( num );
      }

      br.close( );
    }
    catch( IOException e ) {

      System.err.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }

    return( sum );
  }

  public static void main( String[] args ) throws IOException {

    try {

      System.out.println( "Sum: " + getSum( ) );
    }
    catch( IOException e ) {

      System.err.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }
  }
}
