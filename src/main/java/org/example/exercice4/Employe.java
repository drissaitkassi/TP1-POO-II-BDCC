package org.example.exercice4;

abstract class Employe {
    protected String nom;
    protected String prenom;
    protected String email;
    protected String telephone;
    protected double salaire;

    public Employe(String nom, String prenom, String email, String telephone, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public abstract double calculerSalaire();
}

class Ingenieur extends Employe {
    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    public double calculerSalaire() {
        return salaire * 1.15; // Augmentation de 15%
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}

class Manager extends Employe {
    private String service;

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    public double calculerSalaire() {
        return salaire * 1.20; // Augmentation de 20%
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}

 class GestionSalaire {
    public static void main(String[] args) {
        Ingenieur ingenieur = new Ingenieur("Dupont", "Jean", "jean.dupont@example.com", "123456789", 3000, "Développement");
        Manager manager = new Manager("Martin", "Paul", "paul.martin@example.com", "987654321", 5000, "Ressources Humaines");

        System.out.println("Informations de l'ingénieur :");
        System.out.println("Nom: " + ingenieur.nom);
        System.out.println("Prénom: " + ingenieur.prenom);
        System.out.println("Salaire: " + ingenieur.calculerSalaire());
        System.out.println("Spécialité: " + ingenieur.getSpecialite());

        System.out.println("\nInformations du manager :");
        System.out.println("Nom: " + manager.nom);
        System.out.println("Prénom: " + manager.prenom);
        System.out.println("Salaire: " + manager.calculerSalaire());
        System.out.println("Service: " + manager.getService());
    }
}
