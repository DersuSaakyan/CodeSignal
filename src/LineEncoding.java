import java.util.HashMap;
import java.util.Map;

public class LineEncoding {

    static String lineEncoding(String s) {
        String result = "";
        int count = 0;
        String st="";
        String temp = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(temp)) {
                count++;
            } else {
                if (count == 1) {
                    result += temp;
                } else {
                    result += count + temp;

                }
                count=0;
                temp = String.valueOf(s.charAt(i));
                i--;
            }
        }
        if(count>0){
            if(count==1)
                result+=temp;
            else
                result+=count+temp;
        }
        return result;
    }


    public static void main(String[] args) {
        String str = "adfaaa";
        System.out.println(lineEncoding(str));
    }
}
