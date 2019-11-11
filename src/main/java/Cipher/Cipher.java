package Cipher;


public class Cipher {
    private static StringBuffer mResult = new StringBuffer();
    private static String mResultString = new String();


    public static String EncryptCaesarCipher(String wordToEncrypt, int shiftIndex) {
        for (int i = 0; i < wordToEncrypt.length(); i++) {
            if (Character.isUpperCase(wordToEncrypt.charAt(i))) {
                char chart = (char) (((int) wordToEncrypt.charAt(i) + shiftIndex - 65) % 26 + 65);
                mResult.append(chart);
                mResultString = mResult.toString();
            }
            else {
                char charr = (char) (((int) wordToEncrypt.charAt(i) + shiftIndex - 97) % 26 + 97);
                mResult.append(charr);
                mResultString = mResult.toString();
            }
        }
            return mResultString;
    }
    public static String DecryptCeasarCipher(String wordToDecrypt, int shitIndex){
        return EncryptCaesarCipher(wordToDecrypt, 26 - shitIndex );
    }

    public StringBuffer getResult()
    {
        return this.mResult;
    }
    public String getResultString(){

        return this.mResultString;
    }

    public void setmResult(StringBuffer hello) {
        this.mResult= hello;
    }
    public void setmResultString(String bye) {
        this.mResultString = bye;
    }

}


