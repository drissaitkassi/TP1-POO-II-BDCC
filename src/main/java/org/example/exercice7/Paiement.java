package org.example.exercice7;

class Paiement {
    protected double montant;
    protected int numeroTransaction;

    public Paiement(double montant, int numeroTransaction) {
        this.montant = montant;
        this.numeroTransaction = numeroTransaction;
    }

    public void effectuerPaiement(double montant) {
        System.out.println("Paiement effectué avec succès pour un montant de " + montant + " €.");
    }
}

class CarteCredit extends Paiement {
    private String numeroCarte;

    public CarteCredit(double montant, int numeroTransaction, String numeroCarte) {
        super(montant, numeroTransaction);
        this.numeroCarte = numeroCarte;
    }

    public void effectuerPaiement(double montant) {
        System.out.println("Paiement par carte de crédit effectué avec succès pour un montant de " + montant + " €.");
    }
}

class PayPal extends Paiement {
    private String adresseEmail;

    public PayPal(double montant, int numeroTransaction, String adresseEmail) {
        super(montant, numeroTransaction);
        this.adresseEmail = adresseEmail;
    }

    public void effectuerPaiement(double montant) {
        System.out.println("Paiement par PayPal effectué avec succès pour un montant de " + montant + " €.");
    }
}

class Commande {
    private double montantCommande;
    private Paiement moyenPaiement;

    public Commande(double montantCommande, Paiement moyenPaiement) {
        this.montantCommande = montantCommande;
        this.moyenPaiement = moyenPaiement;
    }

    public void processPayment() {
        moyenPaiement.effectuerPaiement(montantCommande);
    }
}

 class GestionPaiementApp {
    public static void main(String[] args) {
        CarteCredit carteCredit = new CarteCredit(100, 123456, "1234 5678 9012 3456");
        PayPal paypal = new PayPal(50, 789012, "john.doe@example.com");

        Commande commande1 = new Commande(100, carteCredit);
        Commande commande2 = new Commande(50, paypal);

        System.out.println("Traitement de la commande 1 :");
        commande1.processPayment();

        System.out.println("\nTraitement de la commande 2 :");
        commande2.processPayment();
    }
}
