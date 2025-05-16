package fr.diginamic.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProduitBuilderTest {
    @Test
    public void testProduitBuildNominal() {
        Produit produit = new ProduitBuilder()
                .nom("Pâté")
                .grade("F")
                .categorie("Gras et salé")
                .marque("Cochonou")
                .ajoutIngredient("Viande de marcassin", 300.7)
                .ajoutIngredient("Viande de coquelet", 59.3)
                .ajoutIngredient("Viande de cerve", 49.0)
                .ajoutAdditif("Aspartame", 10.1)
                .ajoutAllergene("Pistache", 0.01)
                .build();

        assertEquals("Pâté", produit.getNom());
        assertEquals("F", produit.getGrade());
        assertEquals("Gras et salé", produit.getCategorie().getNom());
        assertEquals("Cochonou", produit.getMarque().getNom());
        assertEquals(3, produit.getIngredients().size());
        assertEquals(1, produit.getAdditifs().size());
        assertEquals(1, produit.getAllergenes().size());
    }

    @Test
    public void testProduitBuildAlternatif() {
        Produit produit = new ProduitBuilder()
                .nom("Flotte")
                .grade("AAA")
                .build();

        assertEquals("Flotte", produit.getNom());
        assertEquals("AAA", produit.getGrade());
        assertNull(produit.getCategorie());
        assertNull(produit.getMarque());
        assertTrue(produit.getIngredients().isEmpty());
        assertTrue(produit.getAdditifs().isEmpty());
        assertTrue(produit.getAllergenes().isEmpty());
    }
}
