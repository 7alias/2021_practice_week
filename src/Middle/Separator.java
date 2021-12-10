package Middle;

public class Separator {
    private int[] array;
    private int[] eArray;
    private int[] oArray;
    int a = 0;

    public Separator(int[] array) {
        this.array = array;
        this.eArray = new int[array.length];
        this.oArray = new int[array.length];
    }


    public int[] even() {
        int b = 0;
        for (int i = 0; i < array.length; i++) {

            if (this.array[i] % 2 == 0) {
                this.eArray[b] = this.array[i];
                b += 1;
            }}
            return eArray;
        }

        public int [] odd(){
            int a = 0;
        for (int i = 0; i < array.length; i++) {

                if (this.array[i] % 2 != 0) {
                    this.oArray[a] = this.array[i];
                    a += 1;
                }
            }
            return oArray;
        }
    }

