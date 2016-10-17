package Enumy;

import java.util.Random;

public class PouzitiKontruktor {

    public static void main(String[] args) {
        mojeMesice m0 = mojeMesice.JANUARY; //instance odpovidajici lednu
        mojeMesice m1 = mojeMesice.getRandom(); //náhodná instance
        System.out.println(m1); //vytiskne, který mesic jsme dostali v getRandom()
        System.out.println(m1.getWeatherLore()); //vytiskne nám pranostiku
        //mojeMesice m2 = mojeMesice;

        //mojeMesice m = mojeMesice.getRandom(); //puvodní kod ze zadani, upraveno na m1

        switch (m1) {
            case JUNE:
                System.out.println("Hura na prazdniny!");
                break;
            case SEPTEMBER:
                System.out.println("Skola je tu. :-(");
                break;
            case DECEMBER:
                System.out.println("Budou Vanoce!");
                break;
            default:
                System.out.print(m1.name()+": "); //vypiseme nazev mesice (nazev instance)
                System.out.println("V tomto mesici se nic zvlastniho nedeje. :-)");

                break;
        }
    }

}

enum mojeMesice {
    JANUARY("Je-li teplo v lednu, sahá bída ke dnu."),
    FEBRUARY("Únor bílý, pole sílí."),
    MARCH("Březen - za kamna vlezem."),
    APRIL("Duben - ještě tam budem."),
    MAY("Máj - vyženem kozy v háj."),
    JUNE("Když kvete chrpa, za čtyři neděle chop se srpa."),
    JULY("Co červenec neuvaří - srpen nedopeče."),
    AUGUST("Když srpen z počátku hřeje, ledový vítr v zimě dlouho věje."),
    SEPTEMBER("Bouřka v září - sníh v prosinci."),
    OCTOBER("Sněží-li v říjnu, bude měkká zima."),
    NOVEMBER("Když začátkem listopadu sněží, pak mívá sníh výšku věží."),
    DECEMBER("Chodí-li Kateřina po ledě, chodí Štěpán po blátě.");

    private String weatherLore;

    private mojeMesice(String vstupWeatherLore) {
        this.weatherLore = vstupWeatherLore;
    }

    //Vrati nahodny mesic
    public static mojeMesice getRandom() {
        Random r = new Random(); // pseudonahodny generator cisel
        int count = mojeMesice.values().length;
        return mojeMesice.values()[r.nextInt(count)];
    }

    // Vrati pranostiku na dany mesic

    public String getWeatherLore() {
       return weatherLore;
    }
}
