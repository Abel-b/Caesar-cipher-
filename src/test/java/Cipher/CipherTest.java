package Cipher;

import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {


//    @Test
//    public void accessToPrivates_callBacks_get(){
//        Cipher encrypt = new Cipher("Something", "Nothing");
//        assertEquals("Something" , encrypt.getEncryptText());
//        assertEquals("Nothing", encrypt.getDecrypt());
//    }

    @Test
 public void accessToEncrypt_callBacks_getEncrypt(){
            Cipher cipher=new Cipher();
        cipher.setEncryptText("hello");
        String expected = "hello";
        assertEquals(expected,cipher.getEncryptText());
    }

    @Test
    public void accessToDecrypt_callBacks_getDecrypt(){
        Cipher cipher = new Cipher();
        cipher.setDecryptText("bye");
        String expected = "bye";
        assertEquals(expected, cipher.getDecryptText());
    }

    @Test
    public void inputCeasar_stringInput_string(){
        Cipher testInput = new Cipher();
        String expected = "Lipps";
        assertEquals(expected, testInput.doCaesarCipher("Hello", 4));
    }

}