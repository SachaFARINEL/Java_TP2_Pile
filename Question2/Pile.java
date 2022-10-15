package Question2;

import java.util.ArrayList;

public class Pile {

    private ArrayList<Integer> listeString;

    public Pile() {
        this.listeString = new ArrayList<>();
    }

    public int taille() {
        return this.listeString.size();
    }

    public boolean estVide() {
        return taille() == 0;
    }

    public Integer sommet() {
        return this.listeString.get(this.taille() - 1);
    }

    public void empiler(Integer lastIn) {
        this.listeString.add(lastIn);
    }

    public Integer depiler() {
        Integer ret = sommet();
        this.listeString.remove(sommet());
        return ret;
    }
    
}
