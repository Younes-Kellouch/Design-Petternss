package insurance.advanced;

import insurance.Insurance;

public abstract class AdvancedInsurance implements Insurance {
    Insurance insurance;

    public AdvancedInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}
