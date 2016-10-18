package HashovaciTabulka;

public interface TableIface<KEY, VALUE> {
    public VALUE put(KEY key, VALUE Value);
    
}
