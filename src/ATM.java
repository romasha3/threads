public class ATM {
    int balance;

    public ATM(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(String name,int amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println(name+" знімає "+amount+" грн. Залишок: "+balance+"грн.");
        }else{
            System.out.println(name+" не вдалось зняти "+amount+" грн.Недостатньо коштів."
            );

        }

    }
}
