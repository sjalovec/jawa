package Rozhrani;

public class RozhInterface {
    public static void main(String[] args) {
        
    }
    public interface Movable {
        public static final int SPEED_LIMIT = 50;
        
        public void moveForward();
    }
    
    public interface Reversible {
        public void Reverse();
    }
    class Train implements Movable {
        public void moveForward() {
            System.out.println("jedu dopředu "+SPEED_LIMIT);
        }
    }
    class Car implements Movable, Reversible {
        public void moveForward() {
            System.out.println("jedu vpřed "+(SPEED_LIMIT-5));
        }
        public void Reverse() {
            System.out.println("couvam rychlosti"+SPEED_LIMIT);
        }
    }
}