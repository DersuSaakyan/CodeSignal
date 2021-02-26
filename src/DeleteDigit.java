import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeleteDigit {

//
    public static int deleteDigit(int n) {
        int max = 0;
        for (int num = 1; num < n; num *= 10) {
            max = Math.max(n / 10 / num * num + n % num, max);
        }
        return max;
    }




    public static void main(String[] args) {
        int n = 861452;
        System.out.println(deleteDigit(n));
    }
}
