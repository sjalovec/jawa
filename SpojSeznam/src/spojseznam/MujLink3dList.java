package spojseznam;

public class MujLink3dList implements listIface{
    private UzelNode first;
    private UzelNode last;
    private int size;
    private UzelNode nextNode;
    
    public MujLink3dList(){
        this.size = 0;
    }
    private class UzelNode{
        private int value;
        private UzelNode next;
        
        private UzelNode(int Val){
            this.value = Val;
        }
    }
    public void add(int i){
        UzelNode un = new UzelNode(i);
        if (size==0){
            this.first = un;
            this.last = un;
        }
        else
        {
            this.last.next = un; //prida dalsi pointer za posledni v listu
            this.last = un;
        }
        size++;
    };
    public int get(int i){
        if (i > size) {
            throw new IndexOutOfBoundsException("\n\nChyba, index: " + i + " je větší než velikost: " + size+ "\n");
        }
        if (i < 0) {
            throw new IllegalArgumentException("\n\nChyba, index je mensi nez nula\n");
        }
        UzelNode un = first;
        for (int j = 0; j < i;j++){
            un = un.next; //ulozi pointer na dalsi (next)
        }
        return un.value; //tohle vrati hodnotu
    };
    public int size(){
        return size;
    }
    public void remove(int i){
        if (i > size) {
            throw new IndexOutOfBoundsException("\n\nChyba, index: " + i + " je větší než velikost: " + size+ "\n");
        }
        if (i < 0) {
            throw new IllegalArgumentException("\n\nChyba, index je mensi nez nula\n");
        }
        if (i == 0){
            first = first.next;
        }
        else {
        int foo = 0;
        UzelNode fou = first;
        for (int j = 0; j < i-1; j++){
            //System.out.println(this.first.value); //první HODNOTA z listu, nepotřebuju, index bude alespoň 1
            //System.out.println(this.first.next.value); //následující HODNOTA za první (tzn. druhá)
            //foo = this.first.next.value;
            fou = fou.next;            
            //System.out.println(this.last.value); //poslední HODNOTA z listu
            //System.out.println(this.last.next.value); //spadne na nullpointer - jsem mimo list
            //System.out.println(this.nextNode.next.next.value); //blbost
            //System.out.println(foo);
            System.out.println(fou.value);
        }
        fou = fou.next;
        for (int k = 0;k<size-i;k++) {
            System.out.println("hodnota fou po posunu mimo cyklus "+fou.value);
            System.out.println("jaka je posledni hodnota(last) "+this.last.value);
            fou = fou.next;
            //System.out.println(this.last.next.value); // jeste neexistuje žádná hodnota
            //this.last.next = fou; //tohle prida promenou nakonec list
            System.out.println("kolik je last? "+this.last.value);
        }   
        }
        size--;           
    };
}
    
