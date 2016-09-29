
package Podminky;

public class Dedeni_equals {
    public static void main(String[] args) {
        
    }
}
class Zvire {
    private String kind;
    private String sound;
    public void vydejZvuk(){
        System.out.println("jsem "+kind+" a delam "+ sound);         
    }
   
@Override //kontrola toho, co se dědí/překrvývá
public boolean equals(Object obj){
    if (obj instanceof Zvire){ //validace, že je stejného typu (použití if)
        Zvire zvire_insta = (Zvire) obj; //přetypování intance na objekt???
        if(this.kind.equals(zvire_insta.kind)&& this.sound.equals(zvire_insta.sound)){
            return true;
        }
    }
    return false;
}
@Override
public int hashCode(){
    int hash = 5;
    hash = 79 * hash + (this.kind != null ? this.kind.hashCode() : 0); //pokud platí před otazníkem, pak vlož první hodnotu, jinak nulu (0)
    hash = 79 * hash + (this.sound != null ? this.sound.hashCode() : 0);
    return hash;
    }

} 