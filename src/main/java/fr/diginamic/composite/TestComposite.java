package fr.diginamic.composite;

public class TestComposite {
    public static void main(String[] args) {
        Employe cecile = new Employe("RASPEY", "Cécile", 10000);
        Employe bilel = new Employe("BECHKAR", "Bilal", 8000);
        Employe jb = new Employe("RANMEY", "Jean-Baptiste", 7500);
        Employe jane = new Employe("DOE", "Jane", 3500);
        Employe kevin = new Employe("GUINEAU", "Kévin", 7500);
        Employe paul = new Employe("MARTIN", "Paul", 3500);

        Service javaDev = new Service("Java Dev");
        javaDev.ajouterElement(kevin);
        javaDev.ajouterElement(paul);

        Service bigData = new Service("Big Data");
        bigData.ajouterElement(jb);
        bigData.ajouterElement(jane);

        Service dsin = new Service("DSIN");
        dsin.ajouterElement(cecile);
        dsin.ajouterElement(bilel);
        dsin.ajouterElement(javaDev);
        dsin.ajouterElement(bigData);

        System.out.println(javaDev);
        System.out.println(bigData);
        System.out.println(dsin);

    }
}
