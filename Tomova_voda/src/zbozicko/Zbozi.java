package zbozicko;

public abstract class Zbozi { 
    private TypZbozi zbozi = null;
    public Zbozi(TypZbozi zbozi) {
        this.zbozi = zbozi;
    }
    
    public TypZbozi getZbozi() {
        return zbozi;
    }
    
    public void setZbozi(TypZbozi zbozi) {
        this.zbozi = zbozi;
    }
    
}
