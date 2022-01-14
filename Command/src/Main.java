import model.device.Device;
import model.device.Light;
import model.device.Radio;
import model.device.TV;
import model.remote.Remote;
import model.user.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        Device tv = new TV("TV");
        Device light = new Light("Light");
        Device radio = new Radio("Radio");

        Remote remote = new Remote(tv, light, radio);

        user.press(remote, "TV");       //TV ON
        user.press(remote, "Radio");    //Radio ON
        user.press(remote, "TV");       //TV OFF
        user.press(remote, "Laptop");
        user.pressUndo(remote);                 //TV ON
        user.press(remote, "Light");     //Light ON
        user.pressUndo(remote);                 //Light OFF
        user.pressUndo(remote);                 //Light ON
    }
}
