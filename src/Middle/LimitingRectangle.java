package Middle;

public class LimitingRectangle {

    int[][] points;
    int w;
    int h;
    String borders = "";


    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    int getMin(int index) {
        int min = 10000;
        for (int i = 0; i < points.length; i++) {
            if (points[i][index] <= min) min = points[i][index];
        }
        return min;
    }

    int getMax(int index) {

        int max = -10000;
        for (int i = 0; i < points.length; i++) {
            if (points[i][index] >= max) max = points[i][index];
        }
        return max;
    }

    int getWidth() {
        return this.getMax(0) - this.getMin(0);

    }

    int getHeight() {
        return this.getMax(1) - this.getMin(1);
    }

    String getBorders() {

        return (this.getMin(1) + ", " + this.getMax(1) + ", " + this.getMin(0) + ", " + this.getMax(0));

    }


}

