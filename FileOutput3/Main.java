import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public final class Main {

  public static void main( String[] args ) throws IOException {

    Scanner input = ( new Scanner( System.in ) );
    String content = ( "" );
    String fileName = ( "" );

    try {

      System.out.print( "Enter few words: " );
      content = ( input.nextLine( ) );

      System.out.print( "Enter file name: " );
      fileName = ( input.next( ) ); 

      File file = ( new File( fileName ) );
      file.createNewFile( );
      if( !file.exists( ) ) {

        throw new IOException( "File [" + file.toString( ) + "] could not be created!" );
      }

      FileWriter fout = ( new FileWriter( file.toString( ) ) );

      fout.write( content );

      fout.close( );
    }
    catch( IOException e ) {

      System.err.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }
    finally {

      input.close( );
    }
  }
}
