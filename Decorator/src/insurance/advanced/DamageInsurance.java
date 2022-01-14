package insurance.advanced;

import insurance.Insurance;

public class DamageInsurance extends AdvancedInsurance {

    public DamageInsurance(Insurance insurance) {
        super(insurance);
    }

    @Override
    public void print() {
        insurance.print();
        System.out.println("\t- Les dommages et collisions.");
    }

}
