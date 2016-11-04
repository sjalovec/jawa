package Vlakna;

public class NonAtomicExample {
    
    public volatile static int i = 0; //volatile == necachuj na procesoru
    
    public static void main(String[] args) throws InterruptedException {
        Thread T1 = new MyThread2();
        Thread T2 = new MyThread2();
        
        T1.start();
        T2.start();
        
        Thread.sleep(1000); //na vterinu uspi hlavni vlakno a pracuji dve pridana
        
        System.out.println(i); //mělo by vytisknout 20000
    }

}

class MyThread2 extends Thread {
    
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            NonAtomicExample.i++; // NonAtomicExample.i = NonAtomicExample.i + 1 -> dve operace: scitani a prirazeni
        }
    }
}