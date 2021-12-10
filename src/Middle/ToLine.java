package Middle;

public class ToLine {

    int[][] table;
    int[] t;

    public ToLine(int[][] table) {
        this.table = table;
        this.t = new int[table.length * 2];
    }


    public int[] resize() {
        int h =0;
int k=0;
        for (int i = 0; i < this.table.length; i++) {
            h+=1;
            this.t[i] = table[i][0];}
for (int j =h; j<this.table.length*2; j++){

    this.t[j] = table[k][1];
    k+=1;
        }


        return t;
    }
}


