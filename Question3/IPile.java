package Question3;

public interface IPile<T> {

    public int taille();

    public boolean estVide();

    public T sommet();

    public void empiler(T o);

    public T depiler();

}