package Calculations;
import java.util.Scanner;

public class Calories {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        System.out.println("   Суточная норма калорий ");
        System.out.print("Вес женщины ");
        int weight = out.nextInt();
        System.out.print("Рост женщины ");
        int height = out.nextInt();
        System.out.print("Возраст женщины ");
        int age = out.nextInt();

        System.out.print("Вес Мужчины ");
        int weight1 = out.nextInt();
        System.out.print("Рост мужчины ");
        int height1 = out.nextInt();
        System.out.print("Возраст мужчиныины ");
        int age1 = out.nextInt();
        double women = 655.1 + (9.563 * weight) + (1.85 + height) - (4.676* age);
        double men = 66.5 + (13.75 * weight1) + (5.003 + height1) - (6.775* age1);
        double min = women * 1.2;
        double low = women * 1.375;
        double confident = women * 1.55;
        double high = women * 1.7;
        double extreme = women * 1.9;

        double min1 = men * 1.2;
        double low1 = men * 1.375;
        double confident1 = men * 1.55;
        double high1 = men * 1.7;
        double extreme1 = men * 1.9;

        System.out.println("Суточная норма женщины составляет при Минимальном " + min );
        System.out.println("Суточная норма женщины составляет при Низком " + low );
        System.out.println("Суточная норма женщины составляет при Умеренном " + confident );
        System.out.println("Суточная норма женщины составляет при Высоким " + high );
        System.out.println("Суточная норма женщины составляет при Укстремальном " + extreme );
        System.out.println(" ");
        System.out.println("Суточная норма мужчины составляет при Минимальном " + min1 );
        System.out.println("Суточная норма мужчины составляет при Низком " + low1 );
        System.out.println("Суточная норма мужчины составляет при Умеренном " + confident1 );
        System.out.println("Суточная норма мужчины составляет при Высоким " + high1 );
        System.out.println("Суточная норма мужчины составляет при Укстремальном " + extreme1 );
    }


}
