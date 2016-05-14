import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public final class Main {

  public static void main( String[] args ) throws Exception {

    Scanner input = ( new Scanner( System.in ) );
    String fileName = ( "" );
    String content = ( "" );

    try {

      // if no arguments..
      if( args.length < ( 1 ) ) {

        System.out.println( "Usage: java Main \"type words here\"" );
      }
      else {

        System.out.print( "Enter file name to output: " );
        fileName = ( input.next( ) ); 

        content = ( WordScrambler.scrambleWords( args[0] ) );

        File file = ( new File( fileName ) );
        if( file.createNewFile( ) == ( false ) ) {

          throw new IOException( "File [" + file.toString( ) + "] could not be created!" );
        }

        FileWriter fout = ( new FileWriter( file.toString( ) ) );

        fout.write( content );

        fout.close( );
      }
    }
    catch( Exception e ) {

      System.err.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }
  }
}
