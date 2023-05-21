package hommework4;

import java.util.Scanner;

public class HomWork2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три значения которые будут обозначать углы треугольника22");
        int L1 = in.nextInt();
        int L2 = in.nextInt();
        int L3 = in.nextInt();
        if ((L1+L2+L3)<180) {
            System.out.println("Сумы чисел недостаточно для построения треугольника");
        }
        else if ((L1+L2+L3)>180) {
            System.out.println("Сума чисел слишком большая для построения треугольника");
        }
        else { System.out.println("Сумы чисел достаточно для построения треугольника");
        }

    }
}
