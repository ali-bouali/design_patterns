package dp.chainofresponsibility;

public class ATMDispenseChain {

    public DispenseChain getD50() {
        return d50;
    }

    private DispenseChain d50;

    public ATMDispenseChain() {
        // initialize the chain
        this.d50 = new Dinar50Dispenser();
        DispenseChain d20 = new Dinar20Dispenser();
        DispenseChain d30 = new Dinar30Dispenser();
        DispenseChain d10 = new Dinar10Dispenser();
        DispenseChain d5 = new Dinar5Dispenser();

        // set the chain of responsibility
        d50.setNextChain(d30);
        d30.setNextChain(d20);
        d20.setNextChain(d10);
        d10.setNextChain(d5);
    }
}
