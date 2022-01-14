package model.command;

import model.device.Device;

public class OnCommand extends Command {

    public OnCommand(Device device) {
        super(device);
    }

    @Override
    public void execute() {
        device.on();
    }

}
