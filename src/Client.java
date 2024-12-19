public class Client implements Runnable{
    String name;
    ATM atm;
    int amountOfBalance;

    public Client(ATM atm, String name,int amountOfBalance){
        this.atm = atm;
        this.name=name;
        this.amountOfBalance=amountOfBalance;
    }
    @Override
    public void run() {
        atm.withdraw(name,amountOfBalance);
    }
}
