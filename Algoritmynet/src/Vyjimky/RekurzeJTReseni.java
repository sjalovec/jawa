package Vyjimky; //ma to bejt malym "JT 2016"

public class RekurzeJTReseni {
    static int[] a = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    public static void main(String[] args) {
        
        System.out.println(jTrekurze(0, a.length, 4));    
    }
public static int jTrekurze (int L, int R, int S) {
    int M = L+((R-L)/2);
    if (S==a[M]) {
        return S;
    }
    else if (S < a[M]) {
        return jTrekurze(L, M, S);
    }
    else if (S > a[M]) {
        return jTrekurze(M, R, S);
    }
    else {
        return -1;
    }
    }
}
