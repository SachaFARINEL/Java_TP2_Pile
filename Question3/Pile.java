package Question3;

import java.util.ArrayList;

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
}
