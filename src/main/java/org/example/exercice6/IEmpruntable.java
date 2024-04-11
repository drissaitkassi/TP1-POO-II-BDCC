package org.example.exercice6;
interface Empruntable {
    void emprunter();
    void retourner();
}

class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private boolean emprunte = false;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public void emprunter() {
        if (!emprunte) {
            System.out.println("Le livre \"" + titre + "\" a été emprunté.");
            emprunte = true;
        } else {
            System.out.println("Le livre \"" + titre + "\" est déjà emprunté.");
        }
    }

    public void retourner() {
        if (emprunte) {
            System.out.println("Le livre \"" + titre + "\" a été retourné.");
            emprunte = false;
        } else {
            System.out.println("Le livre \"" + titre + "\" n'est pas emprunté.");
        }
    }
}

class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean emprunte = false;

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
    }

    public void emprunter() {
        if (!emprunte) {
            System.out.println("Le DVD \"" + titre + "\" a été emprunté.");
            emprunte = true;
        } else {
            System.out.println("Le DVD \"" + titre + "\" est déjà emprunté.");
        }
    }

    public void retourner() {
        if (emprunte) {
            System.out.println("Le DVD \"" + titre + "\" a été retourné.");
            emprunte = false;
        } else {
            System.out.println("Le DVD \"" + titre + "\" n'est pas emprunté.");
        }
    }
}

class Utilisateur {
    private String nom;

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public void emprunterObjet(Empruntable objet) {
        objet.emprunter();
    }
}

 class GestionBibliothequeApp {
    public static void main(String[] args) {
        Livre livre1 = new Livre("L'Étranger", "Albert Camus");
        Livre livre2 = new Livre("1984", "George Orwell");
        DVD dvd1 = new DVD("Inception", "Christopher Nolan");
        DVD dvd2 = new DVD("Interstellar", "Christopher Nolan");
        Utilisateur utilisateur = new Utilisateur("Jean");

        utilisateur.emprunterObjet(livre1);
        utilisateur.emprunterObjet(dvd1);
        utilisateur.emprunterObjet(livre1);

        livre1.retourner();
        dvd2.emprunter();
    }
}
