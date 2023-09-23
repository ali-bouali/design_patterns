package dependency_inject;

public class LightBulb implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("ON");
    }

    @Override
    public void turnOff() {
        System.out.println("OFF");

    }
}
