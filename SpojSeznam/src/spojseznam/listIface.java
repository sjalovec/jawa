package spojseznam;

public interface listIface {
    //vloží prvek na konec seznamu
    public void add(int i);
    //odstrani prvek na indexu i
    public void remove(int i);
    //vrátí prvek na indexu i
    public int get(int i);
    //vrátí velikot seznamu
    public int size();
    //vloží prvek na konkréní index
    public void insertAt(int i, int j);
   //vloží prvek za napsany index
    public void insertAfter(int i, int j);
}