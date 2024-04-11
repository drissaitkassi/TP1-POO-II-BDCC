package org.example.exercice5;

abstract class Figure {
    protected String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double calculerAire();

    public abstract double calculerPerimetre();

    public void afficherDetails() {
        System.out.println("Nom de la figure: " + nom);
        System.out.println("Aire de la figure: " + calculerAire());
        System.out.println("Périmètre de la figure: " + calculerPerimetre());
    }
}

class Cercle extends Figure {
    private double rayon;

    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
}

class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle(String nom, double longueur, double largeur) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double calculerAire() {
        return longueur * largeur;
    }

    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }
}

 class TestFigures {
    public static void main(String[] args) {
        Cercle cercle = new Cercle("Cercle", 5);
        Rectangle rectangle = new Rectangle("Rectangle", 4, 6);

        System.out.println("Détails du cercle :");
        cercle.afficherDetails();

        System.out.println("\nDétails du rectangle :");
        rectangle.afficherDetails();
    }
}
