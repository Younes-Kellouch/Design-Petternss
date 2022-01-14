package model.user;

import model.remote.Remote;

public class User {

    public void press(Remote remote, String slotKey) {
        remote.execute(slotKey);
    }

    public void pressUndo(Remote remote) {
        remote.undo();
    }

}
