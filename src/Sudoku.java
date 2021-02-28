public class Sudoku {
    public static boolean sudoku(int[][] s) {
        for (int row = 0; row < 9; row++)
            for (int col = 0; col < 8; col++)
                for (int col2 = col + 1; col2 < 9; col2++)
                    if (s[row][col] == s[row][col2])
                        return false;

// column checker
        for (int col = 0; col < 9; col++)
            for (int row = 0; row < 8; row++)
                for (int row2 = row + 1; row2 < 9; row2++)
                    if (s[row][col] == s[row2][col])
                        return false;

// grid checker
        for (int row = 0; row < 9; row += 3)
            for (int col = 0; col < 9; col += 3)
                // row, col is start of the 3 by 3 grid
                for (int pos = 0; pos < 8; pos++)
                    for (int pos2 = pos + 1; pos2 < 9; pos2++)
                        if (s[row + pos % 3][col + pos / 3] == s[row + pos2 % 3][col + pos2 / 3])
                            return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3, 2, 5, 4, 6, 9, 8, 7},
                {4, 6, 5, 8, 7, 9, 3, 2, 1},
                {7, 9, 8, 2, 1, 3, 6, 5, 4},
                {9, 2, 1, 4, 3, 5, 8, 7, 6},
                {3, 5, 4, 7, 6, 8, 2, 1, 9},
                {6, 8, 7, 1, 9, 2, 5, 4, 3},
                {5, 7, 6, 9, 8, 1, 4, 3, 2},
                {2, 4, 3, 6, 5, 7, 1, 9, 8},
                {8, 1, 9, 3, 2, 4, 7, 6, 5}};
        System.out.println(sudoku(grid));
    }
}
