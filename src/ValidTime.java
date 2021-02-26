public class ValidTime {

    public static boolean validTime(String time) {
        String[] str = time.split(":");
        String horse = str[0];
        String minutes = str[1];
        if (Integer.parseInt(horse) < 24 && Integer.parseInt(minutes) < 60)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validTime("13:56"));
    }

}
