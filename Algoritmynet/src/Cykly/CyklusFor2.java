package Cykly;

//pouzití Fibonacciho posloupnosti

public class CyklusFor2 {
    public static void main(String[] args) {
        System.out.println("počet králíků: "+Fibonacci(4));    
    }
public static int Fibonacci(int index){
    if (index == 0) {
        return 0;
    }
    if (index == 1){
        return 1;
    }
    int result = 0; //toto je náš výsledek, který budeme vracet nakonci
    int prePre = 0; //predminule cislo???
    int pre = 1; //minulé cislo
    for (int i = 1; i<index; i++){ //počítá se od druhé indexu (předchozí výše)
        result = prePre + pre; //výsledek je součet dvou minulých čísel
        prePre = pre; //uložíme aktuální výsledek do předchozího čísla = dostanem se "dál"
        pre = result; //výsledek uložíme aktuálního čísla
    } //opakováním se neustále zvyšuje pre a prePre a hlavně result, který nakonci vracíme
    return result;    
    }
}
