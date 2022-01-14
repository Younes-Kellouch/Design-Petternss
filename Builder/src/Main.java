import model.SmartHome;

public class Main {
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome.SmartHomeBuilder()
                .withName("Smart Home")
                .withCity("Tiznit")
                .withCountry("Morocco")
                .withDoor1PortNum(988)
                .withLight1PortNum(989)
                .build();

        System.out.println(smartHome);
    }
}
