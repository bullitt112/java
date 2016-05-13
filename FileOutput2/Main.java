import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public final class Main {

  private static final String ENTER_TEXT = (  new String( "Enter a filename to create: " ) );
  private static final String EXCEPTION = ( new String( "Exception: " ) );

  public static void main( String[] args ) throws IOException {

    Scanner input = ( new Scanner( System.in ) );
    String tmp_string = ( "" );

    System.out.print( ENTER_TEXT );
    tmp_string = ( input.nextLine( ) );

    File fileName = ( new File( tmp_string ) );

    fileName.createNewFile( );

    try {

      FileWriter fout = ( new FileWriter( fileName ) );

      fout.write( "Hello, World!\n" );

      fout.close( );
    }
    catch( IOException e ) {

      System.err.println( EXCEPTION + e.getMessage( ) );
      e.printStackTrace( );
    }
    finally {

      input.close( );
    }
  }
}
