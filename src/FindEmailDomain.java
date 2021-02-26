public class FindEmailDomain {
    public static String findEmailDomain(String address) {
        return address.substring(address.lastIndexOf("@")+1);
    }




    public static void main(String[] args) {
        String st="admin@mailserver2.ru";
        System.out.println(findEmailDomain(st));
    }
}
