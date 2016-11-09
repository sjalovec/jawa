package Vlakna;

public class VolatileSynchronized {
    public volatile static int i = 0; //volatile == necachuje na CPU
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread3();
        Thread t2 = new MyThread3();
        
        t1.start();
        t2.start();
        
        Thread.sleep(1000);
        System.out.println(i);
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            synchronized(NonAtomicExample.class){ //objekt tridy NonAtomicExample slouzi jako zamek
                VolatileSynchronized.i++; //VolatileSynchronized.i = VolatileSynchronized.i + 1 - dve operace: scitani a prirazeni
            }
        }
    }
}