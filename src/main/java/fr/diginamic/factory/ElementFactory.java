package fr.diginamic.factory;

public class ElementFactory {
    public static Element createElement(TypeElement type, String nom, double valeur, Unite unite) {
        if (type == TypeElement.INGREDIENT) {
            return new Ingredient(nom, valeur, unite);
        } else if (type == TypeElement.ADDITIF) {
            return new Additif(nom, valeur, unite);
        } else if (type == TypeElement.ALLERGENE) {
            return new Allergene(nom, valeur, unite);
        } else {
            return null;
        }
    }

}