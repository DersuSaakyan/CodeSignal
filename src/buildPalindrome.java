public class buildPalindrome {


    static String buildPalindrome(String st) {
        if (st.equals(new StringBuilder(st).reverse().toString())) return st;
        for (int i = 0; i < st.length(); i++) {
            String str = st;
            str += new StringBuilder(st.substring(0, i)).reverse().toString();
            if (str.equals(new StringBuilder(str).reverse().toString())) {
                st = str;
                break;
            }
        }
        return st;
    }

    public static void main(String[] args) {
        String str = "abcdc";
        System.out.println(buildPalindrome(str));
    }
}
