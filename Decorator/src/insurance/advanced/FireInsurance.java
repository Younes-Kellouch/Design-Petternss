package insurance.advanced;

import insurance.Insurance;

public class FireInsurance extends AdvancedInsurance {

    public FireInsurance(Insurance insurance) {
        super(insurance);
    }

    @Override
    public void print() {
        insurance.print();
        System.out.println("\t- Les incendies.");
    }

}