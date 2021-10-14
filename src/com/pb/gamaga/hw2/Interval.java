import java.util.Scanner;

public class Interval {

    private static Scanner in;

    public static void main(String[] args) {

        byte a = 0, b = 14, d = 35, e = 50, f = 100;

        System.out.print("Проверка попадания числа в интервал от 0 до 100" + "\n" + "Введите число: ");

        in = new Scanner(System.in);
        int i = in.nextInt();

        if (i >= a && i <= b) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + a + " до " + b + "\n");
        } else if (i >= b && i <= d) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + b + " до " + d + "\n");
        } else if (i >= d && i <= e) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + d + " до " + e + "\n");
        } else if (i >= e && i <= f) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + e + " до " + f + "\n");
        }   else if (f<= i) {
            System.out.print("Ваше число " + i + " не попадает ни в один интервал");
    }   else if (a <= -i && -i <= f) {
        System.out.print("Ваше число " + i + " является отрицательным");

        }
    }
}
