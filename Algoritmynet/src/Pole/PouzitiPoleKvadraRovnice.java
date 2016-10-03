package Pole;

public class PouzitiPoleKvadraRovnice {

    public static void main(String[] args) {
        //tady bude zavolání výpočtu
    }

    public static double[] solveKvadraRovnici(double a, double b, double c) {
        double d = b * b - 4 * a * c; //výpočet dikriminantu D = b*b - 4ac
        //rovnice ax2+bx+c=0
        if (d < 0) {
            double[] result = new double[0];
            return result;
        } else if (d == 0) {
            double[] result = {-b / 2 * a};
            return result;
        } else {
            double[] result = {(-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a)};
            return result;
        }
    }
}
