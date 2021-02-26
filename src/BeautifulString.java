import com.sun.org.apache.xerces.internal.xni.XMLDTDHandler;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.net.CookieHandler;
import java.util.*;

public class BeautifulString {

    public static boolean isBeautifulString(String str) {
        char[] alpha = new char[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] =(char) (97 + i);
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < alpha.length; i++) {
            list.add(getCountCharacter(alpha[i],str));
        }
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)<list.get(i+1))
                return false;
        }
        return true;
    }

    public static int getCountCharacter(char ch, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                count++;
        }
        return count;
    }


    public static void main(String[] args) {

        String str = "bbbaacdafe";

        System.out.println(isBeautifulString(str));
    }
}
