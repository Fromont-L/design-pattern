package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {

    private String nom;
    private List<IElement> elements = new ArrayList<>();

    public Service(String nom) {
        this.nom = nom;
    }

    public void ajouterElement(IElement element) {
        elements.add(element);
    }

    @Override
    public double calculerSalaire() {
        return elements.stream().mapToDouble(element -> element.calculerSalaire()).sum();
    }

    @Override
    public String toString() {
        return "Service : " + nom + ", Total des salaires = " + calculerSalaire() + "€";
    }
}
