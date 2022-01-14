package insurance;

public class BasicInsurance implements Insurance {
    @Override
    public void print() {
        System.out.println("Cette assurance garantie : ");
        System.out.println("\t- La responsabilité civile.");
    }
}
