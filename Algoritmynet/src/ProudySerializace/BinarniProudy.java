package ProudySerializace;

import java.io.Externalizable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BinarniProudy {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("d:/student.txt")); //instance objectoutputstreamu, dále se používá
        A a = new A(); //instance tříd A pojmenována a
        a.setBar("barA");
        a.setFoo("fooA");
        s.writeObject(a); //zapise a (hodnoty) do souboru
        
        B b = new B(); //instance třídy B pojmenována B
        b.setBar("barB");
        b.setFoo("fooB");
        s.writeObject(b); //zapiseme hodnoty z B (přebráno z class A) a vypise text "serialiting" do konzole
        
        C c = new C(); // instance třídy C pojmenována c
        c.setBar("barC");
        c.setFoo("fooC");
        s.writeObject(c);
        
        s.close(); //uzavření streamu
    }
}

// Demonstrace automaticke serializace
class A implements Serializable {
    protected String foo;
    protected transient String bar;

    public String getFoo() {
        return foo;
    }
    public void setFoo(String fooVstup) {
        this.foo = fooVstup;
    }    
    public String getBar() {
        return bar;
    }   
    public void setBar (String barVstup) {
        this.bar = barVstup;
    }
}

// Demonstrace explicitniho pouziti metod readObject a writeObject
class B extends A {
    private void writeObject (ObjectOutputStream out) throws IOException {
        //zapise automaticky, co lze automaticky zapsat
        out.defaultWriteObject();
        System.out.println("Serializing");      
    }
    private void readObject (ObjectInputStream in) throws IOException, ClassNotFoundException {
        //toto je takovy pseudokonstruktor
        in.defaultReadObject();
        System.out.println("Deserializing");
    } 
}

class C extends A implements Externalizable {
    //konstruktor
    public C() {
    }
    public void writeExternal (ObjectOutput out2) throws IOException {
        out2.writeObject(this.foo); //lepsi citelnost a jistota pro neprepsani
        out2.writeObject(this.bar); //lepsi citelnost a jistota pro neprepsani
    }
    
    public void readExternal (ObjectInput in2) throws IOException, ClassNotFoundException {
        this.foo = (String) in2.readObject(); //přetypování
        this.bar = (String) in2.readObject(); //přetypování
        
    }
}
