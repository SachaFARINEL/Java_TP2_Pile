package Question4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Pile implements IPile<String> {

    private ArrayList<String> listeString;

    public Pile() {
        this.listeString = new ArrayList<>();
    }

    @Override
    public int taille() {
        return this.listeString.size();
    }

    @Override
    public boolean estVide() {
        return taille() == 0;
    }

    @Override
    public String sommet() {
        return this.listeString.get(this.taille() - 1);
    }

    @Override
    public void empiler(String lastIn) {
        this.listeString.add(lastIn);
    }

    @Override
    public String depiler() {
        String ret = sommet();
        this.listeString.remove(sommet());
        return ret;
    }

    public void ecrire(String nomFichier) {
        try {
            Scanner scanner = new Scanner(new File("Question4/" + nomFichier));
            while (scanner.hasNextLine()) {
                this.empiler(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void lire(String nomFichier) {
        try {
            PrintWriter printWriter = new PrintWriter("Question4/" + nomFichier, StandardCharsets.UTF_8);
            for (int i = 0; i < this.taille(); i++) {
                printWriter.println(this.listeString.get(i));
            }
            printWriter.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
