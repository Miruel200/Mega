package LessonSix;

import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        System.out.println("Итоговая оценка");
        System.out.println("Контрольная работа ");
        int control = out.nextInt();
        System.out.println("Тест ");
        int test = out.nextInt();
        System.out.println("Экзамен ");
        int exemp = out.nextInt();
        int result = 0;
        int result1 =0;
        if ((control >= 0 && control <= 100) && (test >=0 && test<=100)&&(exemp >=50 && exemp <=100)){
            result = (control * 30 / 100) + (test * 20 / 100);
            result1 = result + exemp / 100*50;
            System.out.println("Итог: " + result1);
        }
        else
            System.out.println("Не прошел");


    }

}
