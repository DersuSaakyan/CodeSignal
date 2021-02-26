import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestWord {
    public static String longestWord(String text) {
        text=text.replaceAll("[^A-Za-z]+"," ");
        String str[]=text.split(" ");
        String result="";
        for (String s : str) {
            if(s.length()>result.length()){
                result=s;
            }
        }
        return result;
    }

    public static void main(String[] args) {


        System.out.println(longestWord("Ready, steady, go!"));
    }

}
