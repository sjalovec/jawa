
package Metody;

public class TridniMetodyaPromenne {
    //vstup aplikace
    public static void main(String[] args) throws InterruptedException{
        Zviratko asta = new Zviratko(); //toto je konstruktor bez parametru
        asta.setKind("pes");
        asta.setSound("haf haf");
        
        System.out.println("Počet zviřátek: "+Zviratko.getCreatedCount()); //tady by mělo být 1
        
        //nyní vytvoříme jiné zviřátko (nová instance)
        System.out.println("Teď budu vytvářet kočku = další instanci\n");
        Zviratko micka = new Zviratko("kocka", "mňauky čauky"); //konstruktor s parametry
        micka.pozdrav(); //použije metodu pozdrav s hodnotami proměnných zadaných v konstruktoru
        
        System.out.println("Pořet zviřátek: "+Zviratko.getCreatedCount()); //tady by mělo být 2
    }
}

class Zviratko {
    
    //proměnná, která počítá počet vytvořených zvířátek
    private static int createdCount = 0;
    
    //druh zviřátka
    private String kind;
    
    //zvuk, který vydává
    private String sound;
    
    //konstruktor, který při použití uloží do prom +1
    public Zviratko(){
        createdCount++;
    }
    
    //konstruktor, který přijímá jako proměnné kind a sound
    public Zviratko (String kind, String sound){
    this(); //volani bezparametrickeho konstruktoru, zretezene volani konstruktoru musi byt vzdy jako prvni
    this.kind = kind;
    this.sound = sound;
    }
    
    //metoda, co vrací hodnotu createdCount
    public static int getCreatedCount(){
        return  createdCount;
    }
    
    //metoda, která vypíše pozdrav zvířátka
    public void pozdrav(){
        System.out.println("Ahoj, já jsem "+getKind()+" a dělám "+getSound());
    }
    
    /**
     * @return the kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * @return the sound
     */
    public String getSound() {
        return sound;
    }

    /**
     * @param kind the kind to set
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound) {
        this.sound = sound;
    }    
}