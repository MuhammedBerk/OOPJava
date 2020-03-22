package Lab2.Q3;

public class BankAccount {

    String owner;
    double balance;
    int aType;

    public BankAccount(){
        owner = "";
        balance = 0;
        aType = 0;
    }

    public void info(){
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
        System.out.println("aType: " + aType);
    }

    public void addMoney (double a){
        balance += a;
    }
}
