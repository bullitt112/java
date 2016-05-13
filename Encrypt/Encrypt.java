import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public final class Encrypt {

  public static void main( String[] args ) {

    try {
            // setup encryption
	    KeyGenerator keygenerator = ( KeyGenerator.getInstance( "DES" ) );
	    SecretKey myDesKey = ( keygenerator.generateKey( ) );
	    Cipher desCipher;
	    desCipher = ( Cipher.getInstance( "DES" ) );

            // initialize the text
	    byte[] text = "Armond Sarkisian.".getBytes( "UTF8" );
	    
            // encrypt the text
            desCipher.init( Cipher.ENCRYPT_MODE, myDesKey );
	    byte[] textEncrypted = desCipher.doFinal( text );
	    String s = ( new String( textEncrypted ) );
	    System.out.println( "Encrypted Text: " + s );

            // decrypt the text
	    desCipher.init( Cipher.DECRYPT_MODE, myDesKey );
	    byte[] textDecrypted = ( desCipher.doFinal( textEncrypted ) );
	    s = new String( textDecrypted );
	    System.out.println( "Decrypted Text: " + s );
      }
      catch( Exception e ) {
        System.err.println( "Exception: " + e.getMessage( ) );
        e.printStackTrace( );
      }
    }
}
