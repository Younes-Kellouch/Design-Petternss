package insurance.advanced;

import insurance.Insurance;

public class FloodInsurance extends AdvancedInsurance {

    public FloodInsurance(Insurance insurance) {
        super(insurance);
    }

    @Override
    public void print() {
        insurance.print();
        System.out.println("\t- Les innondations.");
    }

}
