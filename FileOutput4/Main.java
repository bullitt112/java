import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class Main {

  public static void main( String[] args ) throws IOException {

    InputStreamReader isr = ( new InputStreamReader( System.in ) );
    BufferedReader br = ( new BufferedReader( isr ) );
    String fileName = ( "" );

    try {
      System.out.print( "Enter file name to write to: " );
      fileName = ( br.readLine( ) );

      File file = ( new File( fileName ) );

      if( file.exists( ) ) {

        throw new IOException( "File already exists!" );
      }
      else {

        if( !file.createNewFile( ) ) {

          throw new IOException( "File could not be created!" );
        }
      }

      FileWriter fw = ( new FileWriter( file.toString( ) ) );
      BufferedWriter bw = ( new BufferedWriter( fw ) );

      bw.write( "Hello, World!" ); 

      bw.close( );
    }
    catch( IOException e ) {

      System.err.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }
    finally {
 
      br.close( );
    }
  }
}
