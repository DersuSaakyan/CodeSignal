import javax.swing.text.TabExpander;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileNaming {
    public static String[] fileNaming(String[] arr) {
        List<String> list = new ArrayList<>();
        int fileCount = 0;
        for (int i = 0; i < arr.length; i++) {
            fileCount = 0;
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            } else {
                String temp = arr[i] + "(" + ++fileCount + ")";
                while (list.contains(temp)) {
                    fileCount++;
                    temp = arr[i] + "(" + fileCount + ")";
                }
                list.add(temp);
            }
        }
        String[] result = new String[list.size()];
        result=list.toArray(result);
        return result;
    }

    public static void main(String[] args) {
        String[] arr = new String[]{
                "dd",
                "dd(1)",
                "dd(2)",
                "dd",
                "dd(1)",
                "dd(1)(2)",
                "dd(1)(1)",
                "dd",
                "dd(1)"
        };
//                "a(1)",
//                "a(6)",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a"};
        System.out.println(Arrays.toString(fileNaming(arr)));

        //        ["doc",
        //      "doc(1)",
//                "image",
//                "doc(1)(1)",
//                "doc(2)"]
    }
}
