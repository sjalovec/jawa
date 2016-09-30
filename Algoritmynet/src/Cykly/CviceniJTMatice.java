package Cykly;

import java.util.Random;

public class CviceniJTMatice {
    public static void main(String[] args) {
        
        Random velikostMaticeX = new Random();
        Random velikostMaticeY = new Random();
        Random velikostMaticeZ = new Random();
        
        int x = velikostMaticeX.nextInt(4)+2; // zadání <2;5>
        int y = velikostMaticeY.nextInt(4)+2; // zadání <2;5>
        int z = velikostMaticeZ.nextInt(4)+2; // zadání <2;5>
        
        int[][] maticeAPole = new int[x][y]; //vytvoření pole pro matici A
        int[][] maticeBPole = new int[y][z]; //vytvoření pole pro matici B
        int[][] maticeCPole = new int[x][z]; //vytvoření pole pro matici C
        
        int i, j, k, l, m, n;
        
        //první matice
        System.out.println("Matice A o velikosti: "+x+"x"+y);
        for (i = 0; i< x;i++){
            for (j = 0; j < y; j++){   
                Random nahCisloA = new Random(); //vygenerování náhodného čísla pro matici
                System.out.print(maticeAPole[i][j] = nahCisloA.nextInt(5)); //přiřazení náh. čísla do pole a print na obraz
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        //druhá matice
        System.out.println("");
        System.out.println("Matice B o velikosti: "+y+"x"+z);
        for (k = 0; k < y; k++){
            for (l = 0; l < z; l++){

                //Random nahCisloB = new Random();  //tahle matice není náhodná 
                System.out.print(maticeBPole[k][l] = ((2*k)+l));
                System.out.print(" ");
            }
            System.out.println("");
        }
        //násobíme matice
        System.out.println("");
        System.out.println("Výsledná matice násobení: "+x+"x"+z);
        {
            /*
            for (int i = 0; i < aRows; i++) { // aRow
            for (int j = 0; j < bColumns; j++) { // bColumn
                for (int k = 0; k < aColumns; k++) { // aColumn
                    C[i][j] += A[i][k] * B[k][j];
            */
            for (i = 0; i<z;i++){
                for (l = 0; l<x;l++){
                    for (j = 0; j < y; j++){
                    System.out.print(maticeCPole[i][l] = maticeCPole[i][l]+(maticeAPole[i][j] * maticeBPole[j][l]));
                    System.out.print(" ");
                    }
                System.out.println("");
                }
            }
        }
        
        
    }

}
