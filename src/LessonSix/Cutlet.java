package LessonSix;
import java.util.Scanner;

public class Cutlet {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        System.out.println(" Задача котлета ");

        System.out.println("Количество котлет на сковородке ");
        int k = out.nextInt();

        System.out.println("Обжарка котлет в мин ");
        int m = out.nextInt();
        System.out.println("Кол-во котлет всего ");
        int n = out.nextInt();
        int time = 0;
        if (n <= k){
            time = m * 2;
        }else if (n % k == 0){
            time = n / k * 2 * m;
        }else
            time =  (n / k + 1) * 2 * m;

        System.out.println(time);


    }

}
