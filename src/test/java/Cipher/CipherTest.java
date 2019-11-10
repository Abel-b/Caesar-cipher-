package Cipher;

import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {



    @Test
    public void accessToDecrypt_callBacks_getDecrypt(){
        Cipher cipher = new Cipher();
        cipher.setmResultString("bye");
        String expected = "bye";
        assertEquals(expected, cipher.getResultString());
    }

    @Test
    public void inputCeasar_stringInput_string(){
        Cipher testInput = new Cipher();
        String expected = "Efip";
        assertEquals(expected, testInput.EncryptCaesarCipher("Abel", 4));
    }

    @Test
    public void ceaserCipher_allowsUppercaseInput_string() {
        Cipher testCeaserCipher = new Cipher();
        String expectedOutput = new String();
        expectedOutput = "EFIP";
        assertEquals(expectedOutput, testCeaserCipher.EncryptCaesarCipher("ABEL", 4));
    }

    @Test
    public void ceaserCipher_doesEncryption_string() {
        Cipher testCeaserCipher = new Cipher();
        String expectedOutput = new String();
        expectedOutput = "efip";
        assertEquals(expectedOutput, testCeaserCipher.EncryptCaesarCipher("abel", 4));

    }

    @Test
    public void ceaserCipher_doesDecryption_string() {
        Cipher testCeaserCipher =  new Cipher();
        String expectedOutput = new String();
        expectedOutput = "abel";
        assertEquals(expectedOutput, testCeaserCipher.DecryptCeasarCipher("efip", 4));
    }

    @Test
    public void unDoCeaserCipher_takesInUppercaseLetters_string() {
        Cipher testCeaserCipher = new Cipher();
        String expectedOutput = "ABEL";
        assertEquals(expectedOutput, testCeaserCipher.DecryptCeasarCipher("EFIP", 4));
    }
}