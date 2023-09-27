package dp.chainofresponsibility;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ATMDispenseChain atm = new ATMDispenseChain();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dipense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be greater that 10 Dinar");
                return;
            }
            atm.getD50().dispense(new Currency(amount));
        }
    }
}
