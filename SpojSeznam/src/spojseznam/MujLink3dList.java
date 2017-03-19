package spojseznam;

public class MujLink3dList implements listIface{
    private UzelNode first;
    private int size;
    
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
        UzelNode n = new UzelNode(i);
        if (size==0){
            this.first = n;
        }
        else
        {
            this.first.next = n;
        }
    };
}
    
