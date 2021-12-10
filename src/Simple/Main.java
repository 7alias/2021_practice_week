package Simple;

public class Main {
    public static void main(String[] args) {


        Task1 task1 = new Task1();
        task1.addLeft(9);
        task1.addRight(10);
        System.out.println(task1.getSituation());


        Task2  task2 = new Task2();
        task2.sound();
        task2.sound();
        task2.sound();
        task2.sound();
        task2.sound();

        Payer payer = new Payer("surname","name","address","cardNumber");
        System.out.println(payer.toString());
    }
}
