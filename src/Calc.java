
public class Calc {
    public static void main(String[] args) {

        int a = 6;
        if (a % 2 == 0) {
            System.out.println("liczba parzysta");
        } else {
            System.out.println("liczba nieparzysta");
        }
        if (a > 0) {
            System.out.println("liczba dodatnia");
        } else {
            System.out.println("liczba ujemna");
        }
        int multi1 = a * 9;
        int multi2 = a * a;

        if (multi1 % 6 == 0) {
            System.out.println(multi1 + " jest podzielna przez 6");
        } else if (multi2 < 100) {
            System.out.println(multi2 + "jest mniejsza od 100");
        } else {
            System.out.println(multi2 + "jest większa od 100");
        }
    }
}


