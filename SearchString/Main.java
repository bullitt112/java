import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public final class Main {
 
  public static boolean searchString( Vector<String> list, String str ) {
    boolean isFound = ( false );

    for( int i = ( 0 ); i < ( list.size( ) ); ++i ) {
      if( list.get( i ).toLowerCase( ).contains( str.toLowerCase( ) ) ) {
        isFound = ( true );
      } 
    }

    return( isFound );
  }
 
  public static void getInput( ) {
    Vector<String> list = ( new Vector<String>( ) );
    Scanner input = ( new Scanner( System.in ) );
    String tmp_string = ( "" );

    list.add( new String( "router" ) );
    list.add( new String( "switch" ) );
    list.add( new String( "hub" ) );
    list.add( new String( "firewall" ) );

    System.out.print( "Enter a search string: " );
    tmp_string = ( input.nextLine( ) );

    System.out.println( "Your string \"" + tmp_string + "\" was " + (searchString( list, tmp_string) ? "found!" : "not found!" ) );

    input.close( );
  }

  public static void main( String[] args ) {

    try {
      getInput( );

    }
    catch( Exception e ) {
      System.err.println( "Error: " + e.getMessage( ) );
      e.printStackTrace( );
    }
  }
}
