package vyrobky;

public abstract class VyrobkyIface {
    private TypVyrobku vyrobek = null;
    
    public VyrobkyIface(TypVyrobku vyrobekVstup){
        this.vyrobek = vyrobekVstup;
    }
   
    public abstract void vypisText();
    
    public abstract void vypisTypVyrobku();
}
