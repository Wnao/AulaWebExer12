package test;

import java.io.File;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

import org.junit.Test;

import cryptografia.AES;

public class AESTest {

	
	@Test
	public void teste() {
		for (int i = 0; i < 5; i++) {
		final String secretKey = "PDQ";
	     
	    String originalString = "1234";
	    String encryptedString = AES.encrypt(originalString, secretKey);
	    String decryptedString = AES.decrypt(encryptedString, secretKey);
	     
	    //System.out.println(originalString);
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);
		}
	}
}
