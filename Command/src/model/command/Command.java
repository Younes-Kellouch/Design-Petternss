package model.command;

import model.device.Device;

abstract public class Command {
    protected Device device;

    public Command(Device device) {
        this.device = device;
    }

    abstract public void execute();
}
