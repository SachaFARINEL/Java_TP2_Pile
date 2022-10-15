package Question5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Pile implements IPile<String>, Serializable {

    private final ArrayList<String> listeString;

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
            Scanner scanner = new Scanner(new File("Question5/" + nomFichier));
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
            PrintWriter printWriter = new PrintWriter("Question5/" + nomFichier, StandardCharsets.UTF_8);
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

    public void writeObject(String nomFichier) throws IOException {
        File file = new File("Question5/" + nomFichier);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        this.ecrire("ecrirePile.txt");
        objectOutputStream.writeObject(this);
        objectOutputStream.close();
    }

    public static void readObject(String nomFichier) throws IOException, ClassNotFoundException {
        File file = new File("Question5/" + nomFichier);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Pile pile = (Pile) objectInputStream.readObject();
        System.out.println(pile.toString());
        objectInputStream.close();
    }

    @Override
    public String toString() {
        return "Pile{" +
                "listeString=" + listeString +
                '}';
    }
}
