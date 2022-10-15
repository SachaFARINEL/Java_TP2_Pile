package Question4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PileTest {

    public static void main(String[] args) throws IOException {
        testEcrireLire();
    }

    private static void testEcrireLire() throws IOException {
        System.out.println("");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("Test de la méthode ecrire() et de la méthode lire()");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("");

        System.out.println("Création de ma pile");

        Pile pile = new Pile();

        System.out.println("Appel de la méthode ecrire()");

        pile.ecrire("ecrirePile.txt");

        System.out.println("Test de la taille de ma pile");

        if (pile.taille() == 10) {
            System.out.println("--> Test OK");
        } else {
            System.out.println("--> Echec");
        }

        System.out.println("Appel de la méthode lire");

        pile.lire("lirePile.txt");

        System.out.println("Test du nombre d'élement présent dans mon fichier");
        Scanner scanner = new Scanner(new File("Question4/lirePile.txt"));

        int i = 0;

        while (scanner.hasNextLine()) {
            i++;
            scanner.nextLine();
        }

        if (i == pile.taille()) {
            System.out.println("--> Test OK");
        } else {
            System.out.println("--> Echec");
        }
        scanner.close();

//        System.out.println("Effacement du contenu du fichier lirePile.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream("Question4/lirePile.txt");
//        fileOutputStream.close();
    }


}
