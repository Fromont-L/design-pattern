package fr.diginamic.builder;

// Builder
public class ProduitBuilder {
    private Produit produit = new Produit();

    public ProduitBuilder nom(String nom) {
        produit.nom = nom;
        return this;
    }
    public ProduitBuilder grade(String grade) {
        produit.grade = grade;
        return this;
    }

    public ProduitBuilder categorie(String nomCategorie) {
        produit.categorie = new Categorie(nomCategorie);
        return this;
    }

    public ProduitBuilder marque(String nomMarque) {
        produit.marque = new Marque(nomMarque);
        return this;
    }

    public ProduitBuilder ajoutIngredient(String nom, double quantiteMilligramme) {
        produit.ingredients.add(new Ingredient(nom, quantiteMilligramme));
        return this;
    }

    public ProduitBuilder ajoutAllergene(String nom, double quantiteMilligramme) {
        produit.allergenes.add(new Allergene(nom, quantiteMilligramme));
        return this;
    }

    public ProduitBuilder ajoutAdditif(String nom, double quantiteMilligramme) {
        produit.additifs.add(new Additif(nom, quantiteMilligramme));
        return this;
    }

    public Produit build() {
        return produit;
    }
}
