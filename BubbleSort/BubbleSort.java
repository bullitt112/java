import java.util.Scanner;

public final class BubbleSort {

  private static void bubbleSort( String[] ca ) {

    String str_buffer = ( "" );
    int compareResult = ( 0 );

    for( int x = ( 0 ); x < ( ca.length ); ++x ) {

      for( int y = ( 0 ); y < ( ca.length - ( 1 ) ); ++y ) {

        compareResult = ( ca[y].compareTo( ca[y + 1] ) );  

        if( compareResult > ( 0 ) ) {

          str_buffer = ( ca[y + 1] );
          ca[y + 1] = ( ca[y] );
          ca[y] = ( str_buffer );        
        }
      }
    }
  }

  private static void display( String[] ca ) {

    System.out.println( "\n" );

    for( String i : ca ) {

      System.out.println( i );
    }
  }

  public static void main( String[] args ) throws Exception {

    Scanner input = ( new Scanner( System.in ) );
    String content = ( "" );

    try {

      System.out.print( "Enter some words: " );
      content = ( input.nextLine( ) );

      String[] content_array = ( content.split( " " ) );

      display( content_array );
      bubbleSort( content_array );
      display( content_array );
    }
    catch( Exception e ) {

      System.err.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }
    finally {

    }
  }
}
