import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public final class Main {

  public static void main( String[] args ) {

    try {
	    Scanner input = ( new Scanner( System.in ) );
	    String txt_buffer = ( "" );

	    System.out.print( "Enter name of file to create: " );
	    txt_buffer = ( input.nextLine( ) ); 

	    File fileName = ( new File( txt_buffer ) );
	    fileName.createNewFile( ); 
            FileWriter fout = ( new FileWriter( fileName ) );

	    fout.write( "Test message!" );   

	    fout.close( );
    }
    catch( IOException e ) {

      System.err.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }
  }
}
