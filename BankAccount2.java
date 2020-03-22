package Lab2.Q4;

import Lab2.Q3.BankAccount;

public class BankAccount2 {

    String owner;
    double balance;
    int aType;

    public BankAccount2(){
        owner = ";";
        balance = 0;
        aType = 0;
    }

    public BankAccount2(String newOwner, double newBalance){
        owner = newOwner;
        balance = newBalance;
        aType = 1;
    }

    public void info(){
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
        System.out.println("aType: " + aType);
    }

    public void addMoney(double a){
        balance += a;
    }
}
