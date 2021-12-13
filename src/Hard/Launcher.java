package Hard;

import java.util.Arrays;

public class Launcher {
    public static void main(String[] args) {


        TicTacToe board = new TicTacToe();
        System.out.println(board.checkGame());

        System.out.println(Arrays.deepToString(board.getField()));

        System.out.println(board.makeMove(1, 1));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(2, 1));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(2, 2));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(3, 1));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(3, 3));
        System.out.println(Arrays.deepToString(board.getField()));
        System.out.println(board.makeMove(1, 3));


        System.out.println(board.checkGame());

        for (int i = 0; i < board.field.length; i++) {
            System.out.println(Arrays.deepToString(board.getField()[i]));
        }


    }
}
