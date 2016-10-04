package Rekurze;

public class EasyRekurze {
    public static void main(String[] args) {
        System.out.println(vypocetFaktorial(4));
    }

    public static int vypocetFaktorial(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * vypocetFaktorial(number - 1);
    }
}
