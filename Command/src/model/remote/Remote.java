package model.remote;

import model.device.Device;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Remote {
    private Map<String, Slot> slots = new HashMap<>();
    private Slot lastPressedSlot;

    public Remote(Device ...devices) {
        for(Device device : devices) {
            addSlot(device);
        }
    }

    private void addSlot(Device device) {
        slots.put(device.getName(), new Slot(device));
    }

    public void execute(String slotKey) {
        if(!slots.containsKey(slotKey)) {
            System.out.println("This remote does not support the device : " + slotKey + ".");
        }
        else {
            slots.get(slotKey).execute();
            lastPressedSlot = slots.get(slotKey);
        }
    }

    public void undo() {
        lastPressedSlot.execute();
    }
}
