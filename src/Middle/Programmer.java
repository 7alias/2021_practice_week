package Middle;

public class Programmer {
    String name;
    String company;
    String position = "intern";

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;

    }

    public String getPosition() {
        return this.position;
    }

    public void work() {

        if (position.equals("intern")) {
            this.position = "junior";
        } else if (position.equals("junior")) {
            this.position = "middle";
        } else if (position.equals("middle")) {
            this.position = "senior";
        } else if (position.equals("senior")) {
            this.position = "lead";
        } else {
        }

    }

}
