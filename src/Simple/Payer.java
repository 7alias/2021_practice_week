package Simple;

public class Payer {

    String surname;
    String name;
    String address;
    String cardNumber;
    String payer;

    public Payer(String surname, String name, String address, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public String toString() {
        payer = "Payer: " + surname + " " + name+","+ " address: " + address+", card: "+cardNumber;
        return payer;

    }

}
