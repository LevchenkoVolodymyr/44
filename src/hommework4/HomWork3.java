package hommework4;

import java.util.Date;
import java.util.Scanner;

public class HomWork3 {
    public static void main(String[] args) {
         /*  Date date = new Date();
        System.out.println("Введите свой год рождения");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int x = 2023-year;
        System.out.println("Ваш возраст:"+x+"лет");
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Введите свой год рождения");
        int yearOld = input.nextInt();
        Date data = new Date();
        String aktualYear = String.format("%tY",data);
        int aktualYearint = Integer.parseInt(aktualYear);
        System.out.println("Ваш возраст:"+(aktualYearint-yearOld)+" лет.");

    }
}
