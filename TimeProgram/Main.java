import java.time.LocalDateTime;

public final class Main {

  public static void main( String[] args ) {

    LocalDateTime date = ( LocalDateTime.now( ) );

    System.out.println( "This year is: " + date.getYear( ) );
    System.out.println( "This month is: " + date.getMonth( ) );
    System.out.println( "This day is: " + date.getDayOfWeek( ) );
    System.out.println( "This hour is: " + date.getHour( ) );
    System.out.println( "This minute is: " + date.getMinute( ) );
    System.out.println( "This second is: " + date.getSecond( ) );
  }
}
