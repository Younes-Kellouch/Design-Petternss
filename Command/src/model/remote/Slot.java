package model.remote;

import model.command.Command;
import model.command.OffCommand;
import model.command.OnCommand;
import model.device.Device;

public class Slot {
    private Device device;
    private Command onCommand;
    private Command offCommand;

    public Slot(Device device) {
        this.device = device;
        this.onCommand = new OnCommand(device);
        this.offCommand = new OffCommand(device);
    }

    public void execute() {
        if (device.isOn()) {
            offCommand.execute();
        } else {
            onCommand.execute();
        }
    }

}
