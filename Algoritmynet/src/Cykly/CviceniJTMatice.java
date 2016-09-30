package Cykly;

import java.util.Random;

public class CviceniJTMatice {
    public static void main(String[] args) {
        
        int n = 5;
        int m = 6;
        for (int i = 0; i< n;i++){
            for (int j = 0; j < m; j++){
                int[][] maticeAPole = new int[n][m];
                Random nahCislo = new Random();
                System.out.print(maticeAPole[i][j] = nahCislo.nextInt(5));
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

}
