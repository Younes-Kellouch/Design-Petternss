package insurance.advanced;

import insurance.Insurance;

public class StealingInsurance extends AdvancedInsurance {

    public StealingInsurance(Insurance insurance) {
        super(insurance);
    }

    @Override
    public void print() {
        insurance.print();
        System.out.println("\t- Le vol.");
    }

}
