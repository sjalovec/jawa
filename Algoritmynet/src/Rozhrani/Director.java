package Rozhrani;

//toto je třída, která rozšiřuje Employee a je volána PouzitiAbstract
public class Director extends Employee{
    private Employee[] employess;
    
    public Director(String dirName, int dirAge, Employee[] employees) {
        super(dirName, dirAge); //použití super volá konstruktor předka
        this.employess = employees;
    }
    @Override //prekryti metody work, která je abstract v Employee
    public void work() {
        System.out.println("Právě řídím tyto lidi: ");
        for (int i = 0; i < employess.length; i++) {
            if (i != 0) { //aby se psala čárka ale ne před prvním zaměstnancem
                System.out.println(", ");
            }
            System.out.print(employess[i].getJmeno());
        }
        System.out.println(""); //další řádek
    }
    public Employee[] getEmployees() {
        return employess;
    }

    public void setEmployess(Employee[] employess) {
        this.employess = employess;
    }
    

}
