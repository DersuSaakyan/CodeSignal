import java.math.BigInteger;

public class MessageFromBinaryCode {

    public static String messageFromBinaryCode(String code) {
        String result="";
        for(int i=0;i<code.length();i+=8){
            String temp=code.substring(i,i+8);
            int c=Integer.parseInt(temp,2);
            char character=(char)c;
            result+=character;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(messageFromBinaryCode("010010000110010101101100011011000110111100100001"));
    }
}
