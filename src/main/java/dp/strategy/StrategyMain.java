package dp.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Context ctx = new Context(new AddOperation());
        System.out.println(ctx.executeStrategy(10, 3));

        Context ctx2 = new Context(new MultiplyOperation());
        System.out.println(ctx2.executeStrategy(10, 3));
    }
}
