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

    public ProduitBuilder ajoutIngredient(String nom, double qteMilligramme) {
        produit.ingredients.add(new Ingredient(nom, qteMilligramme));
        return this;
    }

    public ProduitBuilder ajoutAllergene(String nom, double qteMilligramme) {
        produit.allergenes.add(new Allergene(nom, qteMilligramme));
        return this;
    }

    public ProduitBuilder ajoutAdditif(String nom, double qteMilligramme) {
        produit.additifs.add(new Additif(nom, qteMilligramme));
        return this;
    }

    public Produit build() {
        return produit;
    }
}
