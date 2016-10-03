package Pole;

public class ViceRozmPole {

    public static void main(String[] args) {

    }
    int[][] array2D = new int[3][4]; //pole co má 3 řádky a 4 sloupce

    /*
        int[][] array2D2 = new int[3][]; //druhý rozměr není uveden
            for (int k = 0; k < array2D2.length; k++){ //trojúhelníková matice
                array2D2[k] = new int[k+1];
            }
     */
    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) { //pruchod pres pole poli
            for (int j = 0; j < array[i].length; j++) //pruchod samotnym radkem pole
            {
                System.out.print(array[i][j] + "");
            }
            System.out.println(""); //nový řádek
        }
    }
}
