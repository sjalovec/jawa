package Rozhrani;

//toto je třída, který je volána v PouzitiAbstract.java
public abstract class Employee {

    private String jmeno;
    protected int vek;

    //konstruktor
    public Employee(String name, int age) {
        this.jmeno = name; //hodnoty z kontruktoru se uloží do promennych v rámci tridy
        this.vek = age;
    }
    //abstraktní metoda, nemá/nemůže mít tělo (body)

    public abstract void work();

    public void vypisPraci() {
        System.out.println("Dobrý den, jmenuji se " + getJmeno() + "a je mi " + vek + " let");
    }

    public String getJmeno() {
        return jmeno;
    }

    
}
