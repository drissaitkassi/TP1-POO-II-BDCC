package org.example.exercice1;

public class Compte {
    private String numero;
    private double solde;
    private static int nbComptes = 0;

    public Compte() {
        this.numero = "";
        this.solde = 0;
        nbComptes++;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) {
        if (this.solde >= montant) {
            this.solde -= montant;
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }

    public void afficherCompteInfo() {
        System.out.println("Numéro de compte : " + numero);
        System.out.println("Solde actuel : " + solde);
    }

    public static void afficherNbComptes() {
        System.out.println("Nombre de comptes créés : " + nbComptes);
    }

}