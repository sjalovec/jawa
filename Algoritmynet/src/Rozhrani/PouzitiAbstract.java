package Rozhrani;

public class PouzitiAbstract {
    public static void main(String[] args) {
            Employee em1 = new Secretary("Kristina zbekáče", 18);
            Employee em2 = new Secretary("Petra pov", 20);
            Employee[] array = {em1, em2}; //vytvoření pole
            
            //objekt reditele
            Employee dir = new Director("Lukas panko", 30, array);
            
            //pole dalších zaměstnanců
            Employee[] array2 = {em1, em2, dir};
            
            //for each cyklus pro pruchod pres vsechny prvky kolekce (pole)
            for (Employee employee : array2) {
                //použití polymorfismu
                employee.vypisPraci();
                employee.work(); //tohle je ta abstract, co jsme polymorfovali/prekryvali
                System.out.println(""); //nový řádek pro každého zaměstnance
            }
        }
    }