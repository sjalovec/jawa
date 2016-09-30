package Cykly;

public class CyklusFor1 {
    public static void main(String[] args) {
        System.out.println("výsledek cyklu pro hodnotu 5 je: "+sum(5));   
    }
public static int sum(int nr){
    int sum = 0;
    for (int i = 1; i <= nr; i++){
        sum +=i;
    }
    return sum;
    }
}
