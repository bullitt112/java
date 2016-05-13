import java.util.List;
import java.util.ArrayList;

public final class Main {

  public static void main( String[] args ) throws Exception {

    List<String> list = ( new ArrayList<String>( ) );

    list.add( "hello" );
    list.add( "world" );

    for( String i : list ) {

      System.out.println( i );
    }
    
  }
}
