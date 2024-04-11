package org.example.exercice2;

class Personne {
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private int age;

    public Personne(String nom, String prenom, String email, String tel, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Email: " + email + ", Tel: " + tel + ", Age: " + age;
    }
}

class Adherent extends Personne {
    private int numAdherent;

    public Adherent(String nom, String prenom, String email, String tel, int age, int numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }

    public String toString() {
        return super.toString() + ", Numéro Adhérent: " + numAdherent;
    }
}

class Auteur extends Personne {
    private int numAuteur;

    public Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    public String toString() {
        return super.toString() + ", Numéro Auteur: " + numAuteur;
    }
}

class Livre {
    private int ISBN;
    private String titre;
    private Auteur auteur;

    public Livre(int ISBN, String titre, Auteur auteur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    public String toString() {
        return "ISBN: " + ISBN + ", Titre: " + titre + ", Auteur: " + auteur.toString();
    }
}

 class Bibliotheque {
    public static void main(String[] args) {
        Adherent adherent = new Adherent("Dupont", "Jean", "jean.dupont@example.com", "123456789", 30, 12345);
        Auteur auteur = new Auteur("Martin", "Paul", "paul.martin@example.com", "987654321", 45, 56789);
        Livre livre = new Livre(123456789, "Titre du livre", auteur);

        System.out.println("Informations de l'adhérent :");
        System.out.println(adherent.toString());

        System.out.println("\nInformations du livre :");
        System.out.println(livre.toString());
    }
}
