package HashovaciTabulka;

//rozhraní tabulky

import java.util.Collection;

public interface TableIface<KEY, VALUE> {
    
    //Vlozi prvek do tabulky, pokud jiz prvek s danym klicem existuje, tak bude nahrazen
    public VALUE put(KEY key, VALUE Value);
    
    //Odstrani prvek odpovidajici danemu klici
    public VALUE remove(KEY key);
    
    //vrátí hodnotu prvku podle klíce
    public VALUE get(KEY key);
    
    //dotaz na přítomnost
    public boolean contains(KEY key);
    
    //dotaz na pocet ulozených prvku
    public int size();
    
    //kolekce všech uložených hodnot
    public Collection<VALUE> values();
    
    //kolekce vsech klicu
    public Collection<KEY> keys();
}
