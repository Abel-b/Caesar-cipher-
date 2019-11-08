package Cipher;


public class Cipher {
    private String toBeEncrypted;
    private String toBeDecrypted;
    private StringBuffer mResult = new StringBuffer();
    private String mResultString = new String();


    public String doCaesarCipher(String wordForCaesarCipher, int shiftIndex) {
        for (int i = 0; i < wordForCaesarCipher.length(); i++) {
            if (Character.isUpperCase(wordForCaesarCipher.charAt(i))) {
                char chart = (char) (((int) wordForCaesarCipher.charAt(i) + shiftIndex - 65) % 26 + 65);
                mResult.append(chart);
                mResultString = mResult.toString();
            }
            else {
                char charr = (char) (((int) wordForCaesarCipher.charAt(i) + shiftIndex - 97) % 26 + 97);
                mResult.append(charr);
                mResultString = mResult.toString();
            }
        }
            return mResultString;
    }


    public String getEncryptText(){
        return this.toBeEncrypted;
    }
    public String getDecryptText(){
        return this.toBeDecrypted;
    }

    public void setEncryptText(String hello) {
        this.toBeEncrypted = hello;
    }
    public void setDecryptText(String bye) {
        this.toBeDecrypted = bye;
    }

}


