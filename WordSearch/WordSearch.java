import java.util.Scanner;

public final class WordSearch {

  public static void main( String[] args ) {

    Scanner cinput = ( new Scanner( System.in ) );
    String[] names = { "armond", "syuzi", "seda", "suida" };
    String str_buffer = ( "" );
    boolean isFound = ( false );
    
    do { 
      isFound = ( false );
      System.out.print( "Enter word to search or \"X\" to quit: ");
      str_buffer = ( cinput.nextLine( ) );
      str_buffer = ( str_buffer.toLowerCase( ) );

      if( !str_buffer.equals( "x" ) ) {
        for( int i = ( 0 ); i < ( names.length ); ++i ) {

          if( names[i].equals( str_buffer ) ) {

            isFound = ( true );
            break;
          }
        }
      }

      if( !str_buffer.equals( "x" ) ) {
        if( isFound == ( true ) ) {

          System.out.println( "Word: " + str_buffer + " found!" );
        }
        else {

          System.out.println( "Word: " + str_buffer + " not found!" );
        }
      }
    }while( !str_buffer.equals( "x" ) );
  }
}
