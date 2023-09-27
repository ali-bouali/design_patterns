package dp.chainofresponsibility;

public class Dinar20Dispenser implements DispenseChain {
    private DispenseChain next;
    @Override
    public void setNextChain(DispenseChain next) {
        this.next = next;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 20) {
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.printf("Dispensing %d 20DT note%n", num);
            if (remainder != 0) {
                this.next.dispense(new Currency(remainder));
            }
        } else {
            this.next.dispense(cur);
        }
    }
}
