package model.device;

public class TV extends Device {

    public TV(String name) {
        super(name);
    }

    @Override
    public void on() {
        super.on();
        System.out.println("TV ON");
    }

    @Override
    public void off() {
        super.off();
        System.out.println("TV OFF");
    }
}
