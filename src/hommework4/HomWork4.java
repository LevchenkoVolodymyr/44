package hommework4;
import java.util.Scanner;
public class HomWork4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите два целочисленних числа");
        int x = input.nextInt();
        int y = input.nextInt();
        if (x < y)
            System.out.printf("Вывод:число %d меньше %d и это True", x, y);
        else if (x==y)
            System.out.printf("Вывод:число %d равно %d и это True", x, y);
        else
            System.out.printf("Вывод:число %d меньше %d и это False", x, y);
    }
}
