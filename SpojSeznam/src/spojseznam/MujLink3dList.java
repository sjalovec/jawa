package spojseznam;

public class MujLink3dList implements listIface {

    private UzelNode first;
    private UzelNode last;
    private int size;

    public MujLink3dList() {
        this.size = 0;
    }

    private class UzelNode {

        private int value;
        private UzelNode next;

        private UzelNode(int Val) {
            this.value = Val;
        }
    }

    public void add(int i) {
        UzelNode un = new UzelNode(i);
        if (size == 0) {
            this.first = un;
            this.last = un;
        } else {
            this.last.next = un; //prida dalsi pointer za posledni v listu
            this.last = un;
        }
        size++;
    }

    public int get(int i) {
        if (i > size) {
            throw new IndexOutOfBoundsException("\n\nChyba, index: " + i + " je větší než velikost: " + size + "\n");
        }
        if (i < 0) {
            throw new IllegalArgumentException("\n\nChyba, index je mensi nez nula\n");
        }
        UzelNode un = first;
        for (int j = 0; j < i; j++) {
            un = un.next; //ulozi pointer na dalsi (next)
        }
        return un.value; //tohle vrati hodnotu
    }

    public int size() {
        return size;
    }

    public void remove(int i) {
        System.out.println("Odstraňuji hodnotu na indexu: " + i);
        if (i > size) {
            throw new IndexOutOfBoundsException("\n\nChyba, index: " + i + " je větší než velikost: " + size + "\n");
        }
        if (i < 0) {
            throw new IllegalArgumentException("\n\nChyba, index je mensi nez nula\n");
        }
        if (i == 0) {
            first = first.next;
        } else {
            int foo = 0;
            UzelNode fou = first;
            for (int j = 0; j < i - 1; j++) {
                //System.out.println(this.first.value); //první HODNOTA z listu, nepotřebuju, index bude alespoň 1
                //System.out.println(this.first.next.value); //následující HODNOTA za první (tzn. druhá)
                fou = fou.next;
                //System.out.println(this.last.value); //poslední HODNOTA z listu
                //System.out.println(this.last.next.value); //spadne na nullpointer - jsem mimo list
                //System.out.println(this.nextNode.next.next.value); //blbost
                //System.out.println(foo);
                //System.out.println(fou.value);
            }
            fou.next = fou.next.next;
        }
        size--;
    }

    public void insertAt(int i, int j) {
        System.out.println("V metodě insertAt nastavuji hodnotu " + j + " na index " + i);
        UzelNode uzlik = first;
        if (i > size) {
            throw new IndexOutOfBoundsException("\n\nChyba, index: " + i + " je větší než velikost: " + size + "\n");
        }
        if (i < 0) {
            throw new IllegalArgumentException("\n\nChyba, index je mensi nez nula\n");
        }
        if (i == 0) {
            uzlik.value = j;
        } else {
            for (int k = 0; k <= i - 1; k++) {
                //System.out.println("V cyklu: "+k);
                uzlik = uzlik.next;
            }
            uzlik.value = j;
            //System.out.println("uzlik.value "+uzlik.value);
        }
    }

    public void insertAfter(int i, int j) {
        System.out.println("Velikost pole je: "+size);
        System.out.println("Nastavuji hodnotu " + j + " za index " + i);
        UzelNode helpuzel;
        int helpuzel2;
        UzelNode helpuzel3;
        UzelNode uzlousek = first;
        UzelNode uzlicek = new UzelNode(j);
        //System.out.print("hodnota na poslednim miste: ");
        if (i > size) {
            throw new IndexOutOfBoundsException("\n\nChyba, index: " + i + " je větší než velikost: " + size + "\n");
        }
        if (i < 0) {
            throw new IllegalArgumentException("\n\nChyba, index je mensi nez nula\n");
        }
        if (i == size) {

            this.last.next = uzlicek;
            size++;
        } else {
            //System.out.println("posledni hodnota pres this: "+this.last.value);
            //helpuzel = this.last;
            //this.last.next = helpuzel;
            
            for (int k = 0; k < i + 1; k++) {
                uzlousek = uzlousek.next;
            }
            System.out.println("uzlousek hodnota: "+uzlousek.value);
            //prehozeni hodnoty se musi udelat pres value jinak se to cely posere
            helpuzel = uzlousek;
            
            uzlousek.value = j;
            
            uzlousek.next = helpuzel;
            /*
            
            for (int l = 0; l < size-1; l++){
            //uzlousek = uzlousek.next;
            uzlousek = uzlousek.next.next;
            }
*/
            //size++;
        }
    }
}
