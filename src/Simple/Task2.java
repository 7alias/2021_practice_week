package Simple;


public class Task2 {
    boolean ding = true;

    public void sound() {

        if (ding == true) {
            System.out.println("ding");
            this.ding = false;
        } else {
            System.out.println("dong");
            this.ding = true;
        }
    }
}


