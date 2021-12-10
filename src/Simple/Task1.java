package Simple;

public class Task1 {
    private int right = 0;
    private int left = 0;
    String answer = " ";

    public void addRight(int n) {
        this.right += n;
    }

    public void addLeft(int n) {
        this.left += n;

    }

    public String getSituation() {
        if (this.left < this.right) {
            answer = "R";
        } else if (this.left > this.right) {
            answer = "L";
        } else {
            answer = "=";
        }
        return answer;
    }
}
