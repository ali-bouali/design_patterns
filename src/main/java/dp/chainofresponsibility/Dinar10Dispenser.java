package dp.chainofresponsibility;

public class Dinar10Dispenser implements DispenseChain {
    private DispenseChain next;
    @Override
    public void setNextChain(DispenseChain next) {
        this.next = next;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 10) {
            int num = cur.getAmount() / 10;
            int remainder = cur.getAmount() % 10;
            System.out.printf("Dispensing %d 10DT note%n", num);
            if (remainder != 0) {
                this.next.dispense(new Currency(remainder));
            }
        } else {
            this.next.dispense(cur);
        }
    }
}
