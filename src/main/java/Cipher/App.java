package Cipher;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class App {
    public static void main(String[] args) {
        Cipher myCipher = new Cipher();
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        System.out .println("Welcome to Abel's Java based Ceasar Cipher");
        System.out.println("Would you like to Encrypt or Decrypt?");

        try {
            String inputChocice = bufferedReader.readLine();

            if (inputChocice.equals("Encrypt")) {
                System.out.println("-----------------");
                System.out.println("Enter a word to be encrypted");
                String wordEncrypt = bufferedReader.readLine();
                System.out.println("****************");
                System.out.println("Enter a shift index");
                String shiftIndexEncrypt = bufferedReader.readLine();
                int shiftInteger = Integer.parseInt(shiftIndexEncrypt);
                System.out.println(shiftIndexEncrypt);
                System.out.println("----------------");
                System.out.println(myCipher.EncryptCaesarCipher(wordEncrypt, shiftInteger));
            } else if (inputChocice.equals("Decrypt")) {
                System.out.println("---------------");
                System.out.println("Enter a word to Decrypt");
                String wordDecrypt = bufferedReader.readLine();
                System.out.println("*******************");
                System.out.println("Enter a back shift Index");
                String shiftIndexDecrypt = bufferedReader.readLine();
                int backShiftInteger = Integer.parseInt(shiftIndexDecrypt);
                System.out.println("---------------");
                System.out.println(myCipher.DecryptCeasarCipher(wordDecrypt, backShiftInteger));
            }
            else {
                System.out.println("Please try again. Input not recognized!");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

