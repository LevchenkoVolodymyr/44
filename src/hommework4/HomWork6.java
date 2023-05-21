package hommework4;
import java.util.Scanner;
public class HomWork6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Введите первое число:");
        int L1 = input.nextInt();
        System.out.println("Введите второе число:");
        int L3 = input.nextInt();
        System.out.println("Введите действие над числами: '-', '+','%','/'. ");
        String L2 = input.next();
        int rezultat = L2.equals("+")?L1+L3:
                L2.equals("-")?L1-L3:
                        L2.equals("*")?L1*L3:
                                L2.equals("/")?L1/L3:
                                        L2.equals("%")?L1%L3:0;
        System.out.println(rezultat);
    }
}
