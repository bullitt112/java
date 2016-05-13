public final class Game {


  Game( ) {

  }

  public static void start( ) {
    
    Deck d = ( new Deck( ) );

    d.initialize( );
    d.shuffle( );
    d.display( );
 
  }
}
