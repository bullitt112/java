

public final class Main {

  public static void someFunction( int... n ) {
    
    for( int i : n ) {
      System.out.println( i );
    }
  }

  public static void main( String[] args ) {

    someFunction( 1, 2, 3, 4, 5, 6 ); 
  
  }
}
