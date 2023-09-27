package dp.chainofresponsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain next);

    void dispense(Currency cur);
}
