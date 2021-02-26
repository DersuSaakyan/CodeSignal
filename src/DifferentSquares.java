
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DifferentSquares {
    public static int differentSquares(int[][] matrix) {
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                hashSet.add(matrix[i-1][j-1]+","+matrix[i-1][j]+","+matrix[i][j-1]+","+matrix[i][j]);
            }
        }
        return hashSet.size();
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 1},
                {2, 2, 2},
                {2, 2, 2},
                {1, 2, 3},
                {2, 2, 1}
        };
        System.out.println(differentSquares(matrix));
    }
}
