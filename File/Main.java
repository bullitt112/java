import java.io.File;

public final class Main {

  public static void main( String[] args ) {

    File content = new File( "test" );

    if( content.exists( ) ) {

      if( content.isDirectory( ) ) {
        
        System.out.println( "Directory exists" );
      }
      else if( content.isFile( ) ) {

        System.out.println( "File exists" );
      }
    }
    else {

      System.out.println( "File/Directory does not exist!" );
    }

  }
}
