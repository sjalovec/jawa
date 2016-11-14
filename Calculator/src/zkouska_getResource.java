
import java.net.URL;


public class zkouska_getResource {
    public static void main(String[] args) throws Exception{
        ClassDemo c = new ClassDemo();
    Class cls = c.getClass();

    // finds resource relative to the class location
    URL url = cls.getResource("appletviewer.exe");
    System.out.println("Value = " + url);

    // finds resource relative to the class location
    url = cls.getResource("newfolder/a.txt");
    System.out.println("Value = " + url);
        
    }

    private static class c {

        public c() {
        }
    }

    private static class ClassDemo {

        public ClassDemo() {
        }
    }

}
