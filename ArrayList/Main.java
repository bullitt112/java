import java.util.ArrayList;
import java.util.Scanner;

public final class Main {

  static ArrayList<String> networkDevices = ( new ArrayList<String>( ) );

  static void bubbleSort( ) {

    String str_buffer = ( "" );
    int result = ( 0 );

    for( int x = ( 0 ); x < ( networkDevices.size( ) ); ++x ) {

      for( int y = ( 0 ); y < ( networkDevices.size( ) - 1 ); ++y ) {

        result = ( networkDevices.get( y ).compareTo( networkDevices.get( y + 1 ) ) ); 

        if( result > ( 0 ) ) {
          str_buffer  = ( networkDevices.get( y + 1 ) );
          networkDevices.set( y + 1, networkDevices.get( y ) );
          networkDevices.set( y, str_buffer );           
        } 
      }
    }
  }

  static void getValues( ) {

    Scanner input = ( new Scanner( System.in ) );
    String str_buffer = ( "" );
    int num = ( 0 );

    System.out.print( "How many values do you want to input: " );
    num = ( input.nextInt( ) );

    for( int i = ( 0 ); i < ( num ); ++i ) {

      System.out.print( (i + 1 ) + ") Enter name of device: " );
      str_buffer = ( input.nextLine( ) );
      
      networkDevices.add( new String( str_buffer ) );
    } 
  }

  static void display( ) {

    System.out.println( "\n" );

    for( String s : networkDevices ) {

      System.out.println( s );
    }
  }
 
  public static void main( String[] args ) {

    try {

      getValues( );
      bubbleSort( );
      display( );
    }
    catch( Exception e ) {

      System.err.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }    
  }
}
