package model;

import model.obeserver.Observable;

public class Departement extends Observable {
    private double budget;
    private double blockedBudget;

    public Departement(double budget) {
        super();
        this.budget = budget;
    }

    public PurchaseRequest purchase(double amount) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(amount, this);
        notifyObservers(purchaseRequest);
        return purchaseRequest;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "budget=" + budget +
                ", blockedBudget=" + blockedBudget +
                '}';
    }

    public double getBudget() {
        return budget;
    }

    public void blockBudget(double amount) {
        budget -= amount;
        blockedBudget = amount;
    }

    public void resetBlockedBudget() {
        blockedBudget = 0;
    }
}
