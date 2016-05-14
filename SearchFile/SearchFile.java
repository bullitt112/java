import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.IOException;

public final class SearchFile {

  public static void main( String[] args ) throws IOException {

    try {
      InputStreamReader isr = ( new InputStreamReader( System.in ) );
      BufferedReader br = ( new BufferedReader( isr ) );
      String fileName = ( "" );
      String fileLine = ( "" );
      int sum = ( 0 );

      System.out.print( "Enter filename: " );
      fileName = ( br.readLine( ) );

      File file = ( new File( fileName ) );
      if( !file.exists( ) ) {

        throw new IOException( "File does not exist!" );
      }

      FileReader fr = ( new FileReader( file.toString( ) ) );
      BufferedReader bfr = ( new BufferedReader( fr ) );

      while( ( fileLine = ( bfr.readLine( ) ) ) != ( null ) ) {

        for( int i = ( 0 ); i < ( fileLine.length( ) ); ++i ) {

          if( Character.isDigit( fileLine.charAt( i ) ) ) {

            sum += ( Character.getNumericValue( fileLine.charAt( i ) ) );
          }
        }
      }

      bfr.close( );
      br.close( );

      System.out.println( "Sum is " + sum );
    }
    catch( IOException e ) {

      System.err.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }
  }
}
