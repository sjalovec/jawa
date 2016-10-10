package GenerikaIterator;

public interface ListIface<ENTITY> extends Iterable<ENTITY> {
    //vložení prvku na konec seznamu
    public void add(ENTITY i);
    
    //vrátí prvek indexu
    public ENTITY get(int i);
    
    //smaže prvek ze seznamu na pozici i
    public void remove (int i);
    
    //vrátí velikost seznamu
    public int size();

}
