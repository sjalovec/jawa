package Rekurze;

public class CviceniFiboRekurze {

    public static void main(String[] args) {
        System.out.println(mujFibonacci(3));

    }

    public static int mujFibonacci(int i) {
        //F(0) = 0, F(1) = 1, F(n-1)+(n-2)
        if (i == 0) {
            return 0; //první kontrola
        } else if (i == 1) {
            return 1; //druha kontrola
        } else {
            return mujFibonacci(i - 1) + mujFibonacci(i - 2);
        }
    }
}