package Dedicnost;

public class Polymorfismus {
     public static void main(String[] args) {
        Zamestnanec2 zam1 = new Zamestnanec2("Pepa Smetátáčků", 17);
        Zamestnanec2 zam2 = new Zamestnanec2("Jarda Houba", 22);
        Zamestnanec2 zam3 = new Zamestnanec2("Karel Ředidlo", 55);        
        Zamestnanec2[] zamPole = {zam1, zam2, zam3}; //vytvoření pole 3 zamšstnanců
        
        Director2 red = new Director2("Tomas daBaus", 25, zamPole);
        //pole, které má 4 ukazatele na předky
        Zamestnanec2[] zamPole2 =  {zam1, zam2, zam3, red};
        
        for (Zamestnanec2 zamestnanec2 : zamPole2) {
            zamestnanec2.work();
            testOverloading(zamestnanec2);
        }
    }
    private static void testOverloading(Zamestnanec2 zamestnanec2) {
        System.out.println("Metoda s parametrem zamestnanec2");
    } 
    private static void testOverloading(Director2 director) {
        System.out.println("Metoda s parametrem director (instance Director2)");
    }
}

//trida zamestnanec
class Zamestnanec2 {
    private String name;
    private int age;
    
    public Zamestnanec2(String name, int age) {
        this.name = name;
        this.age = age;
    }    
    public void work() {
        System.out.println("Jmenuji se "+getName()+" je mi "+getAge()+" a pracuji na ukolu.");
    }   
    //get na name
    public String getName() {
        return name;
    }
    //get na age
    public int getAge() {
        return age;
    }
    //set na name
    public void setName(String name) {
        this.name = name;
    }
    //set na age
    public void setAge(int age) {
        this.age = age;
    }  
}

//trida reditele, coz je zamestnanec, který má specifický ukol + mu přidávám pole pro každého podřízeného
class Director2 extends Zamestnanec2{
    private Zamestnanec2[] zamestnanci;
    
    public Director2(String name, int age, Zamestnanec2[] zamestnanci) {
        super(name, age); //volame konstruktor predka
        this.zamestnanci = zamestnanci;
    }
    
    @Override //prekryti metody
    public void work() {
        super.work(); //volání metody predka = provede se a pokračuje dál
        System.out.println("Prave ridim následující lidi: ");
        for (int i = 0; i < zamestnanci.length; i++) {
            if (i != 0) { //upravuje, aby nebyla čárka před prvním zaměstnancem
                System.out.println(", ");
            }
            System.out.print(zamestnanci[i].getName());
        }
        System.out.println(""); //konec se odřádkuje
    }
    //vrati zamestnance
    public Zamestnanec2[] getZamestnanci() {
        return zamestnanci;
    }
    //set zamestnanců
    public void setZamestnanci(Zamestnanec2[] zamestnanci) {
        this.zamestnanci = zamestnanci;
    }

}
