public class ChessKnight {
    public static int chessKnight(String cell) {

        int step = 0;
        String w = String.valueOf(cell.charAt(0));
        int i = Integer.parseInt(String.valueOf(cell.charAt(1)));

        if ((w.equals("a") || w.equals("h"))) {
            step += 2;
            if (i == 2 || i == 7)
                step++;
            else if (i > 2 && i < 7)
                step += 2;
        } else if (w.equals("b") || w.equals("g")) {
            step += 3;
            if (i == 2 || i == 7)
                step++;
            else if (i > 2 && i < 7)
                step += 3;
        } else if (w.equals("c") || w.equals("f") || w.equals("d") || w.equals("e")) {
            step += 4;
            if (i == 2 || i == 7)
                step+=2;
            else if (i > 2 && i < 7)
                step += 4;
        }

        return step;
    }


    public static void main(String[] args) {
        String ceil="b7";
        System.out.println(chessKnight(ceil));

    }
}
