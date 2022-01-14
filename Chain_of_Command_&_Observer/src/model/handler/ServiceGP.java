package model.handler;

import model.PurchaseRequest;

public class ServiceGP extends POSystemHandler {

    @Override
    protected void handle(Object... args) {
        PurchaseRequest purchaseRequest = (PurchaseRequest) args[0];

        System.out.println("Service Gestion Patrimoine is working...");

        purchaseRequest.getDepartement().resetBlockedBudget();

        System.out.println("Service Gestion Patrimoine finished...");

    }
}
