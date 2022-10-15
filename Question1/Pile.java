package Question1;

import java.util.ArrayList;

public class Pile {

    private ArrayList<String> listeString;

    public Pile() {
        this.listeString = new ArrayList<>();
    }

    public int taille() {
        return this.listeString.size();
    }

    public boolean estVide() {
        return taille() == 0;
    }

    public String sommet() {
        return this.listeString.get(this.taille() - 1);
    }

    public void empiler(String lastIn) {
        this.listeString.add(lastIn);
    }

    public String depiler() {
        String ret = sommet();
        this.listeString.remove(sommet());
        return ret;
    }
}
