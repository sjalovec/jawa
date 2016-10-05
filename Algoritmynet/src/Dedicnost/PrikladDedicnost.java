package Dedicnost;

public class PrikladDedicnost {
    public static void main(String[] args) {
        Zamestnanec zam1 = new Zamestnanec("Pepa Smetátáčků", 17);
        Zamestnanec zam2 = new Zamestnanec("Jarda Houba", 22);
        Zamestnanec zam3 = new Zamestnanec("Karel Ředidlo", 55);
        
        zam1.work();
        zam2.work();
        zam3.work();
        
        Zamestnanec[] zamPole = {zam1, zam2, zam3}; //vytvoření pole 3 zamšstnanců
        
        Director red = new Director("Tomas daBaus", 25, zamPole);
        red.work();
    }
}

//trida zamestnanec
class Zamestnanec {
    private String name;
    private int age;
    
    public Zamestnanec(String name, int age) {
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
class Director extends Zamestnanec{
    private Zamestnanec[] zamestnanci;
    
    public Director(String name, int age, Zamestnanec[] zamestnanci) {
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
    public Zamestnanec[] getZamestnanci() {
        return zamestnanci;
    }
    //set zamestnanců
    public void setZamestnanci(Zamestnanec[] zamestnanci) {
        this.zamestnanci = zamestnanci;
    }
}