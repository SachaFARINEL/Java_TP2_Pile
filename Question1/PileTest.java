package Question1;

public class PileTest {

    public static void main(String[] args) {
        testEmpiler();
        testEstVide();
        testDepiler();
    }

    private static void testEmpiler() {
        System.out.println("");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("Test de la méthode empiler() && du constructeur && de de la méthode sommet() && de la méthode taille()");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("");

        System.out.println("Création d'une Question1.Pile");

        Pile pile = new Pile();

        System.out.println("Appel de la méthode empiler()");
        System.out.println("Ajout du mot : voiture");

        pile.empiler("voiture");

        System.out.println("On test en même tant la méthode sommet()");
        System.out.println("Le sommet doit être 'voiture'");

        if (pile.sommet().equals("voiture")) {
            System.out.println("--> Test OK");
        } else {
            System.out.println("--> Echec du test !");
        }

        System.out.println("Ajout du mot : maison");

        pile.empiler("maison");

        System.out.println("Le sommet doit être 'maison'");

        if (pile.sommet().equals("maison")) {
            System.out.println("--> Test OK");
        } else {
            System.out.println("--> Echec du test !");
        }

        System.out.println("Ajout du mot : fruit");

        pile.empiler("fruit");

        System.out.println("Le sommet doit être 'fruit'");

        if (pile.sommet().equals("fruit")) {
            System.out.println("--> Test OK");
        } else {
            System.out.println("--> Echec du test !");
        }

        System.out.println("La taille de la pile doit être de 3");

        if (pile.taille() == 3) {
            System.out.println("--> Test OK");
        } else {
            System.out.println("--> Echec du test !");
        }
    }

    private static void testEstVide() {
        System.out.println("");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("Test de la méthode estVide()");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("");

        System.out.println("Création d'une Question1.Pile");

        Pile pile = new Pile();

        System.out.println("La pile doit être vide");
        if (pile.estVide() == true) {
            System.out.println("--> Test OK");
        } else {
            System.out.println("--> Echec du test !");
        }
        System.out.println("On ajoute un élèment à la pile");

        pile.empiler("voiture");

        System.out.println("La pile ne doit pas être vide");

        if (pile.estVide() == false) {
            System.out.println("--> Test OK");
        } else {
            System.out.println("--> Echec du test !");
        }

    }

    private static void testDepiler() {
        System.out.println("");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("Test de la méthode depiler()");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("");

        System.out.println("Création d'une Question1.Pile");

        Pile pile = new Pile();

        System.out.println("Remplissage de la pile");
        pile.empiler("maison");
        pile.empiler("voiture");
        pile.empiler("fruit");

        System.out.println("Sommet de la pile : " + pile.sommet());

        System.out.println("Test de la méthode depiler()");
        System.out.println("le retour de la méthode doit être fruit");
        if (pile.depiler().equals("fruit")) {
            System.out.println("--> Test OK");
        } else {
            System.out.println("--> Echec du test !");
        }

        System.out.println("le nouveau sommet doit être 'voiture'");

        if (pile.sommet().equals("voiture")) {
            System.out.println("--> Test OK");
        } else {
            System.out.println("--> Echec du test !");
        }
    }
}
