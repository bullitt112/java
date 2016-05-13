import java.util.Scanner;

public final class MinMaxSumAvg {

  private static void display( int min, int max, int sum, int avg ) {

    // display all the results
    System.out.println( "Min: " + min );
    System.out.println( "Max: " + max );
    System.out.println( "Sum: " + sum );
    System.out.println( "Avg: " + avg );
  }

  public static void main( String[] args ) {

    Scanner input = ( new Scanner( System.in ) );
    int num = ( 0 );
    int avg = ( 0 );
    int sum = ( 0 );
    int min = ( 0 );
    int max = ( 0 );
    int count = ( 0 );

    System.out.print( "Enter count: " ); 
    count = ( Integer.parseInt( input.nextLine( ) ) ); 

    for( int i = ( 0 ); i < ( count ); ++i ) {

      System.out.print( "Enter number: " );
      num = ( Integer.parseInt( input.nextLine( ) ) );

      if( num > ( max ) ) {

        max = ( num );
      }

      if( num < ( min ) ) {

        min = ( num );
      }

      sum += ( num );
    }

    avg = ( sum / count );

    display( min, max, sum, avg );
  }
}
