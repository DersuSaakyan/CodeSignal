import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsMac48Address {


    static boolean  isMAC48Address(String inputString) {
        Pattern p = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
        Matcher m = p.matcher(inputString);
        return m.find();
    }


    public static void main(String[] args) {
        String str="00-1B-63-84-45-E6";
        System.out.println(isMAC48Address(str));
    }
}
