package model.device;

public class Radio extends Device {
    public Radio(String name) {
        super(name);
    }

    @Override
    public void on() {
        super.on();
        System.out.println("Radio ON");
    }

    @Override
    public void off() {
        super.off();
        System.out.println("Radio OFF");
    }
}
