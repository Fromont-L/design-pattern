package fr.diginamic.factory;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertThrows;

public class ElementFactoryTest {
    @Test
    public void testCreaIngredient() {
        Element element = ElementFactory.createElement(TypeElement.INGREDIENT, "Poivre", 0.6, Unite.MILLI_GRAMMES);
        assertTrue(element instanceof Ingredient);
        assertEquals("Poivre", element.nom);
        assertEquals(0.6, element.valeur);
        assertEquals(Unite.MILLI_GRAMMES, element.unite);
    }

    @Test
    public void testCreaAdditif() {
        Element element = ElementFactory.createElement(TypeElement.ADDITIF, "Aspartame", 6000.6, Unite.MICRO_GRAMMES);
        assertTrue(element instanceof Additif);
        assertEquals("Aspartame", element.nom);
        assertEquals(6000.6, element.valeur);
        assertEquals(Unite.MICRO_GRAMMES, element.unite);
    }

    @Test
    public void testCreaAllergene() {
        Element element = ElementFactory.createElement(TypeElement.ALLERGENE, "Cacahuètes", 50.5, Unite.MILLI_GRAMMES);
        assertTrue(element instanceof Allergene);
        assertEquals("Cacahuètes", element.nom);
        assertEquals(50.5, element.valeur);
        assertEquals(Unite.MILLI_GRAMMES, element.unite);
    }

}
