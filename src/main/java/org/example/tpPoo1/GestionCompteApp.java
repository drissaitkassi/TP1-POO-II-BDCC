package org.example.tpPoo1;

public class GestionCompteApp {

    public static void main(String[] args) {
        Compte c1 = new Compte(11111, "Ahmed", 20000);
        Compte c2 = new Compte(22222, "HAJAR", 30000);

        c1.retirer(19000);
        c2.retirer(45000);

        c1.deposer(15000);

        System.out.println("Informations sur le compte c1 :");
        c1.afficherCompteInfo();
        System.out.println();

        System.out.println("Informations sur le compte c2 :");
        c2.afficherCompteInfo();
    }
}
