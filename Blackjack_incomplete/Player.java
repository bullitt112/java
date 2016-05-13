import java.util.ArrayList;

public class Player {

  double my_balance;
  String my_name; 

  public ArrayList<String> my_hand; 

  Player( final double bal, final String name ) {
    this.my_balance = ( bal );
    this.my_name = ( name );
    
    this.my_hand = ( new ArrayList<String>( ) ); 
  }

  public double balance( ) {

    return( my_balance );
  }

  public void setBalance( final double amt ) {

    my_balance += ( amt );
  }
}
