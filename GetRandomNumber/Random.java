public final class Random {

  public static void main( String[] args ) {

    int randNum = ( (int)Math.floor( Math.random( ) * 20 ) );

    System.out.println( "Random number: " + Integer.toString( randNum ) );
  }
}
