package Pole;

public class BubbleSort {
    public static void main(String[] args) {
        
    }
public static void bubbleSort(int[] poleProBubble){
        for (int i = 0; i < poleProBubble.length-1;i++) {
            for (int j = 0; j < poleProBubble.length - i - 1; j++) { //postupne redukujeme problem
                if (poleProBubble[j] > poleProBubble[j + 1] ) { //kontrola na zarazení prvku
                    int temp = poleProBubble[j]; //prohození prvku
                    poleProBubble[j] = poleProBubble[j+1];
                    poleProBubble[j + 1] = temp;
                }
            }
        }
    }    
}
