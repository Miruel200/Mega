package LessonSix;

import java.util.Scanner;

public class ConvertTwo {
    public static void main(String[] args) {
       double dollar = 88.5;
       double rubl = 1.45;
       double euro = 90.1;
        System.out.println("Введите в какую валюту хотите конвертировать ");
        System.out.println("1 - Доллар : Курс 88.5 ");
        System.out.println("2 - Рубль: Курс 1.45 ");
        System.out.println("3 - Евро: Курс 90.1 ");
        Scanner out = new Scanner(System.in);
        double som = out.nextDouble();
        double cout = 0;
        if (som == 1){
            double cout1 = out.nextDouble();
            System.out.println("Вы выбрали Доллар: Курс 88.5");
            cout = cout1 * dollar;
            System.out.println(" Сумма равна " + cout);
        }else if (som == 2){
            double cout1 = out.nextDouble();
            System.out.println("Вы выбрали Рубль: Курс 1.45");
            cout = cout1 * rubl;
            System.out.println(" Сумма равна " + cout);
        }else if (som == 3){
            double cout1 = out.nextDouble();
            System.out.println("Вы выбрали Евро: Курс 90.1");
            cout = cout1 * euro;
            System.out.println(" Сумма равна " + cout);
        }else
            System.out.println(" Не правильный ввод ");

    }
}
