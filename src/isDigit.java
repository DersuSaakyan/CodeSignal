import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isDigit {

    static boolean isDigit(char symbol) {
        String str= String.valueOf(symbol);
        Pattern pattern=Pattern.compile("[0-9]");
        Matcher matcher=pattern.matcher(str);
        return matcher.find();
    }

    public static void main(String[] args) {
        System.out.println(isDigit('8'));
    }
}
