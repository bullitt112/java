import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class Main {

  public static void main( String[] args ) throws IOException {

    File file = ( new File( "armond.txt" ) );
    FileInputStream fin = null;

    try{

      fin = ( new FileInputStream( file ) );
      int content = ( 0 );

      System.out.println( "Total File Size: " + fin.available( ) );

      while( ( content = fin.read( ) ) != ( -1 ) ) {

        // convert to char and display it
        System.out.println( (char) content );
      }
    }
    catch( IOException e ) {

      System.err.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }
    finally {

      try {
  
        if( fin != ( null ) ) {

          fin.close( );
        }
      }
      catch( IOException ex ) {

        System.err.println( "Exception: " + ex.getMessage( ) );
        ex.printStackTrace( );
      }
    }
  }
}
