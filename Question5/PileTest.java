package Question5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PileTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        testWriteObject();
        Pile.readObject("writeObjectSer.txt");
    }

    private static void testWriteObject() throws IOException {
        System.out.println("");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("Test de la méthode writeObject()");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("");

        System.out.println("Création de ma pile");

        Pile pile = new Pile();

        System.out.println("Appel de ma méthode writeObject()");

        pile.writeObject("writeObjectSer.txt");

        System.out.println("Test pour savoir si le fichier à bien été rempli");
        File file = new File("Question5/writeObjectSer.txt");

        if (file.length() > 0) {
            System.out.println("--> Test OK");
        } else {
            System.out.println("Echec du test");
        }

    }
}
