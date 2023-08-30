package LessonSix;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        /* int a = 100;
        double b = 0.85;
        System.out.println(" 100 dollars = 85 euro " + (a * b)); */
        System.out.println("Задача Конвертер валют");
        Scanner out = new Scanner(System.in);
        System.out.println("Введите сумму");
        double money = out.nextDouble();
        System.out.println("Введите курс валют ");
        double rate = out.nextDouble();
        double result = 0;
        if (money > 0 && rate > 0 ){
            result = money * rate;
            System.out.println( result);
        }else
            System.out.println(" Некоректно введено");
    }
}
