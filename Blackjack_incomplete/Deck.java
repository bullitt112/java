import java.util.ArrayList;

public final class Deck {

  private static ArrayList<String> my_deck = ( new ArrayList<String>( ) );

  Deck( ) {

    initialize( );
  }

  public static void initialize( ) {

    if( !my_deck.isEmpty( ) ){
      
      my_deck.clear( );
    }
    
    my_deck.add( new String( "AH" ) );
    my_deck.add( new String( "2H" ) );
    my_deck.add( new String( "3H" ) );
    my_deck.add( new String( "4H" ) );
    my_deck.add( new String( "5H" ) );
    my_deck.add( new String( "6H" ) );
    my_deck.add( new String( "7H" ) );
    my_deck.add( new String( "8H" ) );
    my_deck.add( new String( "9H" ) );
    my_deck.add( new String( "10H" ) );
    my_deck.add( new String( "JH" ) );
    my_deck.add( new String( "QH" ) );
    my_deck.add( new String( "KH" ) );
    
    my_deck.add( new String( "AS" ) );
    my_deck.add( new String( "2S" ) );
    my_deck.add( new String( "3S" ) );
    my_deck.add( new String( "4S" ) );
    my_deck.add( new String( "5S" ) );
    my_deck.add( new String( "6S" ) );
    my_deck.add( new String( "7S" ) );
    my_deck.add( new String( "8S" ) );
    my_deck.add( new String( "9S" ) );
    my_deck.add( new String( "10S" ) );
    my_deck.add( new String( "JS" ) );
    my_deck.add( new String( "QS" ) );
    my_deck.add( new String( "KS" ) );
    
    my_deck.add( new String( "AD" ) );
    my_deck.add( new String( "2D" ) );
    my_deck.add( new String( "3D" ) );
    my_deck.add( new String( "4D" ) );
    my_deck.add( new String( "5D" ) );
    my_deck.add( new String( "6D" ) );
    my_deck.add( new String( "7D" ) );
    my_deck.add( new String( "8D" ) );
    my_deck.add( new String( "9D" ) );
    my_deck.add( new String( "10D" ) );
    my_deck.add( new String( "JD" ) );
    my_deck.add( new String( "QD" ) );
    my_deck.add( new String( "KD" ) );
    
    my_deck.add( new String( "AC" ) );
    my_deck.add( new String( "2C" ) );
    my_deck.add( new String( "3C" ) );
    my_deck.add( new String( "4C" ) );
    my_deck.add( new String( "5C" ) );
    my_deck.add( new String( "6C" ) );
    my_deck.add( new String( "7C" ) );
    my_deck.add( new String( "8C" ) );
    my_deck.add( new String( "9C" ) );
    my_deck.add( new String( "10C" ) );
    my_deck.add( new String( "JC" ) );
    my_deck.add( new String( "QC" ) );
    my_deck.add( new String( "KC" ) );
  }

  public static String deck( final int e ) {
  
    return my_deck.get( e );
  }

  public static void shuffle( ) {
    ArrayList<String> tmp_deck = ( new ArrayList<String>( ) );
    int randomNumber = ( 0 );
	
    // index through all the cards
    while( !( my_deck.isEmpty( ) ) ) {
			
      // generate the random number
      randomNumber = ( ( int ) Math.floor(Math.random( ) * my_deck.size( ) ) );
			
      if( my_deck.contains( my_deck.get( randomNumber ) ) ) {

        tmp_deck.add( new String( my_deck.get( randomNumber ) ) );
        my_deck.remove( randomNumber );
			
      } // end of if

    } // end of while
     
    // copy temp deck back to main deck
    my_deck = ( tmp_deck );

  } // end of method public static void shuffle

  public static void display( ) {
  
    for( String i : my_deck ) {
    
      System.out.println( i );
    }
  }
}
