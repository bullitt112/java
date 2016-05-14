import java.util.Scanner;

public final class CalcFeet {

  private static double calcFeet( double in ) {

    return( in / 12 );
  }

  public static void main( String[] args ) {

    Scanner cinput = ( new Scanner( System.in ) );
    double inches = ( 0.0 );

    System.out.print( "Enter inches: " );
    inches = ( Double.parseDouble( cinput.nextLine( ) ) );

    System.out.println( inches + " inches converted is " + Double.toString( calcFeet( inches ) )  + " feet" );
  }
}
