public class SumUpNumbers {

   public static int sumUpNumbers(String inputString) {
        inputString=inputString.replaceAll("[^0-9]+"," ");
        String []str=inputString.split(" ");
        int sum=0;
        for (String s : str) {
            if (!s.equals("")) {
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str="there are some (12) digits 5566 in this 770 string 239";
//        String inputString=str.replaceAll("[^0-9]+","");
        System.out.println(sumUpNumbers(str));
    }
}
