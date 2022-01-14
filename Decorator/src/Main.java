import insurance.BasicInsurance;
import insurance.Insurance;
import insurance.advanced.*;

public class Main {
    public static void main(String[] args) {

        Insurance insurance1 = new BasicInsurance();
        System.out.println("Assurance 1 : ");
        insurance1.print();

        AdvancedInsurance insurance2 = new DamageInsurance(new BasicInsurance());
        insurance2 = new FloodInsurance(insurance2);
        System.out.println("\nAssurance 2 : ");
        insurance2.print();

        AdvancedInsurance insurance3 = new DamageInsurance(new BasicInsurance());
        insurance3 = new FireInsurance(insurance3);
        insurance3 = new StealingInsurance(insurance3);
        System.out.println("\nAssurance 3 : ");
        insurance3.print();

        insurance1 = new FloodInsurance(insurance1);
        System.out.println("\n\nL'assurance 1 a été changée : ");
        insurance1.print();
    }
}
