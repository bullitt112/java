import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Main {

  private static void display( List<String> l ) {

    for( String i : l ) {

      System.out.println( i );
    }
  }

  public static void main( String[] args ) throws IOException {

    try {

      List<String> list = ( new ArrayList<String>( ) );
      Scanner cinput = ( new Scanner( System.in ) );
      String fileName = ( "" );
      String fileLine = ( "" );

      System.out.print( "Enter file name to read from: " );
      fileName = ( cinput.nextLine( ) );

      File file = ( new File( fileName ) );
      if( !file.exists( ) ) {

        throw new IOException( "File \"" + file.toString( ) + "\" not found!" ); 
      }

      FileReader fr = ( new FileReader( file.toString( ) ) );
      BufferedReader br = ( new BufferedReader( fr ) ); 

      while( ( fileLine = ( br.readLine( ) ) ) != ( null ) ) {

        list.add( fileLine );
      }        

      br.close( );

      display( list );
    }
    catch( IOException e ) {

      System.err.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }
  }
}
