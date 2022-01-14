package model.device;

public class Light extends Device {
    public Light(String name) {
        super(name);
    }

    @Override
    public void on() {
        super.on();
        System.out.println("Light ON");
    }

    @Override
    public void off() {
        super.off();
        System.out.println("Light OFF");
    }
}
