/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Metody;

/**
 * @author P3401971
 */
public class PredavaniParametru {
    public static void main(String[] args) {
        
        //moje instance, vypíše null - protože nemáme žádné hodnoty v promenné
        PredavaniParametru PP_instance_1 = new PredavaniParametru();
        PP_instance_1.coJsem();
        
    }
    private String kind;
    private String sound;
    
    public void coJsem() {
        System.out.println("Tohle je test typu: " + getKind() + "\na typu 2: " + getSound());
        System.out.println("Funguje?");
    }    
    public String getKind(){
        return kind;
    }   
    
    public String getSound(){
        return sound;
    }
    
    public void setKind(String kind){
        this.kind = kind;
    }
    
    public void setSound(String sound){
        this.sound = sound;
    }

}
