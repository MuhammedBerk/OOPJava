package Lab2.Q3;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount person1 = new BankAccount();

        person1.owner = "Ali Veli";
        person1.balance = 1000;
        person1.aType = 0;

        person1.info();

        System.out.println();

        person1.addMoney(500);

        person1.info();

        System.out.println();

        person1.addMoney(-1500);

        person1.info();
    }
}
