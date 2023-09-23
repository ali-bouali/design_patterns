package dependency_inject;

public class Switcher {

    private Switchable device;

    public Switcher(Switchable device) {
        this.device = device;
    }

    void on() {
        device.turnOn();
    }

    void off() {
        device.turnOff();
    }
}
