package Middle;

public class ToTable {
    int[][] t;
    int[] table;
    int x;
    int y;
    int k;

    public ToTable(int[] table, int x, int y) {
        this.t = new int[x][y];
        this.table = table;
        this.x = x;
        this.y = y;
        this.k = table.length/2;
    }


    public int[][] resize() {
        int h = 0;

        for (int i = 0; i < this.y; i++) {
            this.t[0][i] = table[h];
            h+=1;
        }

        for (int j = 0; j < this.x; j++) {
            this.t[1][j] = table[k];
            k+=1;
        }

        return t;
    }
}
