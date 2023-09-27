package dp.chainofresponsibility;

public class Dinar5Dispenser implements DispenseChain {
    private DispenseChain next;
    @Override
    public void setNextChain(DispenseChain next) {
        this.next = next;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 5) {
            int num = cur.getAmount() / 5;
            int remainder = cur.getAmount() % 5;
            System.out.printf("Dispensing %d 5DT note%n", num);
            if (remainder != 0) {
                this.next.dispense(new Currency(remainder));
            }
        } else {
            this.next.dispense(cur);
        }
    }
}
