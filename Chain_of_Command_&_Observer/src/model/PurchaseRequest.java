package model;

public class PurchaseRequest {
    private double amount;
    private Departement departement;

    public PurchaseRequest(double amount, Departement departement) {
        this.amount = amount;
        this.departement = departement;
    }

    public double getAmount() {
        return amount;
    }

    public Departement getDepartement() {
        return departement;
    }
}
