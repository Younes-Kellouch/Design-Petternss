package model.device;

public abstract class Device {
    private String name;
    private boolean isOn = false;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void on() {
        this.isOn = true;
    };

    public void off() {
        this.isOn = false;
    };
}
