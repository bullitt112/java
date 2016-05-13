public final class Main {

  public static void main( String[] args ) {

    try {
      Game game = ( new Game( ) );

      game.start( );
    }
    catch( Exception e ) {

      System.err.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }
 }
}
