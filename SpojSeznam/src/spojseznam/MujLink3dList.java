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
            this.last.next = un; //whaaaaaaat?!
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
        UzelNode k = first;
        for (int j = 0; j < i;j++){
            k = k.next; //proc tady není k = this.last.next???
        }
        return k.value;
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
    };
}
    
