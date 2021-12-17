package Hard;

import java.util.Arrays;

public class Launcher {
    public static void main(String[] args) {

        Squirrel s = new Squirrel(new int[] {2, 5, -3, -1});
        System.out.println("Squirrel1: " + s.maxNuts());
        Squirrel s2 = new Squirrel(new int[] {1, -2, 3, 1, -1, -4, 2, 3});
        System.out.println(s2.maxNuts());
        System.out.println(s.getNuts(1));


        /*        SeaBoard board = new SeaBoard();
        board.shoot(0,0,"m");
        board.shoot(1,0,"h");
        board.shoot(2,0,"h");
        board.shoot(3,0,"h");
        board.shoot(4,0,"h");
        board.check(0,0);
        board.shoot(5,0,"h");
        board.shoot(6,0,"h");
        board.shoot(7,0,"h");
        board.shoot(8,0,"h");
        board.shoot(9,0,"h");
        board.shoot(2,0,"h");
        board.shoot(6,9,"h");
        board.shoot(5,9,"h");
        board.shoot(2,1,"d");

        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
            System.out.print("[" + board.getField()[i][j] + "]");
        }}


        //В этом классе реализуйте:
        //
        //            приватное поле field (поле игры, двумерный массив строка 10 на 10, заполненный точками);
        //            метод getField(), возвращающий двумерный массив строк (10 на 10, поле игры);
        //            метод void shoot(int line, int column, String issue), принимающий в себя координаты на поле (от 0 до 9, другие числа туда подать не могут) и строку с исходом этого выстрела (m — miss/промах, h — hit/попадание и d — destroy/уничтожение, гарантируется, что другие буквы туда подать не могут);
        //            метод check(int line, int column), возвращающий . (точку), если в клетку [line][column] еще не стреляли, # — если стреляли, но не попали (или, например, потопили корабль, а эта клетка соседняя), x — если в этой клетке было попадание.
        //
        //Примечание:
        //
        //Поле представляет собой двумерный массив строк 10 на 10. Все клетки, в которые еще не стреляли, — это . (точки). Попадания и сбитые корабли — это x, а промахи — #.
        //
        //Пример:
        //
        //Ввод
        //
        //SeaBoard board = new SeaBoard();
        //board.shoot(0, 0, m);
        //board.shoot(2, 0, h);
        //board.shoot(6, 9, h);
        //board.shoot(2, 1, d);
        //*Выводим поле, используя board.getField();
        //
        //Вывод:
        //
        //#.........
        //###.......
        //xx#.......
        //###.......
        //..........
        //..........
        //.........x
        //..........
        //..........
        //..........





        /*

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
*/

    }
}
