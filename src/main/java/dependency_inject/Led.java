package dependency_inject;

public class Led implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Smooth on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smooth off");
    }
}
