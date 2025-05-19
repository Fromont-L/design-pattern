package fr.diginamic.composite;

public class Employe implements IElement{

    private String nom;
    private String prenom;
    private double salaire;

    public Employe(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    @Override
    public double calculerSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return prenom + " " + nom + ", salaire : " + salaire + "€";
    }
}
