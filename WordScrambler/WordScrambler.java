import java.util.ArrayList;

public final class WordScrambler {

  public static String scrambleWords( String str ) throws Exception {

    ArrayList<StringBuilder> finalArray = ( new ArrayList<StringBuilder>( ) );
    String[] tmpArray = ( new String[]{ } );
    String finalString = ( "" );
    int randNum = ( 0 );
    
    try {

      // split the string
      tmpArray = ( str.split( " " ) );
      
      // copy the string array into an array list manually 1 by 1
      for( int i = ( 0 ); i < ( tmpArray.length ); ++i ) {
          StringBuilder tmpStringBuilder = ( new StringBuilder( ) );
          tmpStringBuilder.append( tmpArray[i] );
          
          // add the temporary stringbuilder into the arraylist
          finalArray.add( tmpStringBuilder );
      }
      
      // index through all the words
      for( int x = ( 0 ); x < ( finalArray.size( ) ); ++x) {
          
          // index through all the characters
          for ( int y = ( 0 ); y < ( finalArray.get( x ).length( ) ); ++y ) {

            do {          
                randNum = ( (int)Math.floor( Math.random( ) * finalArray.get( x ).length( ) ) );
            
            // choose another random number if it has been checked off
            }while( finalArray.get( x ).charAt( randNum ) == '-' );
            
            // add the random character to the final string
            finalString += ( finalArray.get( x ).charAt( randNum ) );
            
            // turn off that character so it will not be used anymore
            finalArray.get( x ).setCharAt( randNum, '-' );
          }

          // add a space inbetween words to form a complete sentence
          finalString += ( " " );
      }
    }
    catch( Exception e ) {

      System.err.println( "Exception: " + e.getMessage( ) );
      e.printStackTrace( );
    }

    // return scrambled words
    return( finalString );
  }
}
