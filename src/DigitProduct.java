import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitProduct {


    public static int digitsProduct(int product) {
        if (product == 0) {
            return 10;
        }
        if (product < 10) {
            return product;
        }
        List<Integer> factors = new ArrayList<>();
        for (int i = 9; i > 1; i--) {
            if (product % i == 0) {
                factors.add(i);
                product /= i;
                i++;
            }
        }
        if (product != 1) {
            return -1;
        }
        int ans = 0;
        for (int i = factors.size() - 1; i >= 0; i--) {
            int num = factors.get(i);
            ans = (ans * 10) + num;
        }
        return ans;
    }

    public static void main(String[] args) {
        digitsProduct(450);
    }
}
