package model.command;

import model.device.Device;

public class OffCommand extends Command {

    public OffCommand(Device device) {
        super(device);
    }

    @Override
    public void execute() {
        device.off();
    }

}
