package model.handler;

import model.PurchaseRequest;
import model.obeserver.Observer;

public class ServiceComptable extends POSystemHandler implements Observer {
    @Override
    protected void handle(Object... args) {
        PurchaseRequest purchaseRequest = (PurchaseRequest) args[0];
        double departementBudget = purchaseRequest.getDepartement().getBudget();

        System.out.println("Service Comptable is working...\n");

        if (departementBudget < purchaseRequest.getAmount()) {
            System.out.println("Unauthorized Purchase : Not enough budget for purchase.");
        } else {
            purchaseRequest.getDepartement().blockBudget(purchaseRequest.getAmount());
            System.out.println(purchaseRequest.getDepartement());
            System.out.println("\nService Comptable finished...");
            doNext(purchaseRequest);
        }
    }

    @Override
    public void update(Object[] args) {
        PurchaseRequest purchaseRequest = (PurchaseRequest) args[0];
        handle(purchaseRequest);
    }
}
