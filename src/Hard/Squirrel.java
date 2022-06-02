package Hard;

public class Squirrel {
    int[] nuts;
    int[] bigArray;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    int getNuts(int n) {
        return nuts[n];
    }

    int maxNuts() {
        if (nuts.length > 1) {
            bigArray = nuts.clone();
            bigArray[1] = max(bigArray[1], bigArray[0] + bigArray[1]);
            if (bigArray[1] < 0) bigArray[1] = 0;
            for (int i = 2; i < bigArray.length; i++) {
                bigArray[i] = max(bigArray[i] + bigArray[i - 1], bigArray[i] + bigArray[i - 2]);
                if (bigArray[i] < 0) bigArray[i] = 0;
            }
            int a = max(bigArray[bigArray.length - 2], bigArray[bigArray.length - 1]);
            return max(0, a);
        } else return max(0, nuts[0]);
    }

    private int max(int a, int b) {
        if (a >= b) return a;
        return b;
    }
}


