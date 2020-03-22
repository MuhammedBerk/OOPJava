package Lab2.Q4;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

public class TestBankAccount2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of the owner: ");
        String name = sc.next();

        System.out.println("Enter type of the account: ");
        int type = sc.nextInt();

        BankAccount2 account = new BankAccount2(name,type);

        System.out.println();

        account.info();
    }
}
