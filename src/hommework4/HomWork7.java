package hommework4;
import java.util.Scanner;
public class HomWork7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите вашу ОS: Windows, LiNux, macOS");
        String Oss = input.nextLine();
        String system2;
        switch (Oss.toUpperCase()) {
            case ("WINDOWS"):
                System.out.println("Введите вашу програму: IntelliJ IDEA, Git, Java");
                system2 = input.nextLine();
                switch (system2.toUpperCase()) {
                    case ("INTELLIJ IDEA"):
                        System.out.println("Вот ваша ссылка 'https://www.jetbrains.com/idea/'");
                        break;
                    case ("GIT"):
                        System.out.println("Вот ваша ссылка 'https://github.com/'");
                        break;
                    case ("JAVA"):
                        System.out.println("Вот ваша ссылка 'https://www.java.com/'");
                        break;
                    default:
                        System.out.println("На такую програму мы ссылки не нашли");
                }
                break;

            case ("LiNUX"):
                System.out.println("Введите вашу програму: IntelliJ IDEA, Git, Java");
                system2 = input.nextLine();
                switch (system2.toUpperCase()) {
                    case ("INTELLIJ IDEA"):
                        System.out.println("Вот ваша ссылка 'https://www.jetbrains.com/idea'");
                        break;
                    case ("GIT"):
                        System.out.println("Вот ваша ссылка 'https://github.com'");
                        break;
                    case ("JAVA"):
                        System.out.println("Вот ваша ссылка 'https://www.java.com'");
                        break;
                    default:
                        System.out.println("На такую програму мы ссылки не нашли");
                }

                break;
            case ("MACOS"):
                System.out.println("Введите вашу програму: IntelliJ IDEA, Git, Java");
                system2 = input.nextLine();
                switch (system2.toUpperCase()) {
                    case ("INTELLIJ IDEAA"):
                        System.out.println("Вот ваша ссылка 'https://www.jetbrains.com/idea'");
                        break;
                    case ("GIT"):
                        System.out.println("Вот ваша ссылка 'https://github.com'");
                        break;
                    case ("JAVA"):
                        System.out.println("Вот ваша ссылка 'https://www.java.com/'");
                        break;
                    default:
                        System.out.println("На такую програму мы ссылки не нашли");
                }
                break;
            default:
                System.out.println("Такой операционной системы мы не нашли");

        }


    }
}
