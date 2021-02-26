public class SpiralNumbers {
    public static int[][] spiralNumbers(int n) {
        int[][] spiralArr = new int[n][n];
        int spiralCol = 0;
        int spiralRow = 0;
        int arrCol = n;
        int arrRow = n;
        int step = 0;

        while (spiralCol < arrCol && arrRow > spiralRow) {
            for (int i = spiralCol; i < arrCol; i++) {
                step++;
                spiralArr[spiralRow][i] = step;
            }
            spiralRow++;

            for (int i = spiralRow; i < arrRow; i++) {
                step++;
                spiralArr[i][arrCol - 1] = step;
            }
            arrCol--;
            for (int i = arrCol - 1; i >= spiralCol; i--) {
                step++;
                spiralArr[arrRow - 1][i] = step;
            }
            arrRow--;

            for (int i = arrRow - 1; i >= spiralRow; i--) {
                step++;
                spiralArr[i][spiralCol] = step;
            }
            spiralCol++;
        }
        return spiralArr;
    }


    public static void main(String[] args) {
//        System.out.println(spiralNumbers(3));
        int[][] arr = spiralNumbers(3);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
