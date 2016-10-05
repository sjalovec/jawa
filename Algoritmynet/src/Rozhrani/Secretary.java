//trida secretary rozsiruje Employee
package Rozhrani;

public class Secretary extends Employee {
    public Secretary (String secName, int secVek) {
        super(secName, secVek);
    }
    //tady je prekryti work pro sekretarku
    @Override
    public void work() {
        System.out.println("jsem sekretarka a pracuju na BO");
    }
}
