package org.example.exercice3;

class Vehicule {
    protected String nom;
    protected double prix;

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void emettreSon() {
        System.out.println("Le véhicule émet un son inconnu.");
    }

    public void afficherInformations() {
        System.out.println("Nom: " + nom + ", Prix: " + prix);
    }
}

class Voiture extends Vehicule {
    private String modele;
    private int annee;

    public Voiture(String nom, double prix, String modele, int annee) {
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    public void emettreSon() {
        System.out.println("La voiture vrombit.");
    }

    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Modèle: " + modele + ", Année: " + annee);
    }
}

class Moto extends Vehicule {
    private String marque;
    private int puissance;

    public Moto(String nom, double prix, String marque, int puissance) {
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    public void emettreSon() {
        System.out.println("La moto rugit.");
    }

    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Marque: " + marque + ", Puissance: " + puissance);
    }
}

class Avion extends Vehicule {
    private String compagnie;
    private int vitesseMax;

    public Avion(String nom, double prix, String compagnie, int vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    public void emettreSon() {
        System.out.println("L'avion fait un bruit de moteur puissant.");
    }

    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Compagnie: " + compagnie + ", Vitesse Maximale: " + vitesseMax);
    }
}

 class TestVehicules {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Toyota", 20000, "Camry", 2022);
        Moto moto = new Moto("Honda", 10000, "CBR", 600);
        Avion avion = new Avion("Boeing", 10000000, "Air France", 1000);

        voiture.emettreSon();
        voiture.afficherInformations();

        moto.emettreSon();
        moto.afficherInformations();

        avion.emettreSon();
        avion.afficherInformations();
    }
}