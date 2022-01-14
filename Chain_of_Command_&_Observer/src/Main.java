import model.Departement;
import model.handler.ServiceComptable;
import model.handler.ServiceGP;

public class Main {
    public static void main(String[] args) {
        ServiceComptable serviceComptable = new ServiceComptable();
        ServiceGP serviceGP = new ServiceGP();
        serviceComptable.setNextHandler(serviceGP);

        Departement departementInfo = new Departement(20000);

        departementInfo.addObserver(serviceComptable);

        System.out.println(departementInfo + "\n");
        departementInfo.purchase(15000);
        System.out.println("\n" + departementInfo);
    }
}
