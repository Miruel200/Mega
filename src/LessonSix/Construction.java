package LessonSix;
import java.util.Scanner;

public class Construction {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
       /* System.out.println(" Первая задача");
        System.out.println("Вводим первое число");
        int num1 = out.nextInt();
        System.out.println("Вводим второе число");
        int num2 = out.nextInt();
        if (num1 == num2){
            System.out.println(" Числа равны ");
        }else if (num1 > num2){
            System.out.println(" Первое число больше");
        }else {
            System.out.println(" Второе больше ");
        }*/
       /* System.out.println("Вторая задача");
        System.out.println("Ввести год ");
        int year = out.nextInt();
        if ( year % 4 == 0 && (year != 0 || year % 400 == 0)){
            System.out.println(" Високостный ");
        }else
            System.out.println(" Не високостный ");*/
        System.out.println("Третья задача ");
        System.out.println("Вводим месяц");
        int mont = out.nextInt();
        if (mont >= 1 && mont <=3)
            System.out.println("I");
        else if (mont >= 4 && mont <=6 )
            System.out.println("II");
        else if (mont >= 7 && mont <= 9)
            System.out.println("III");
        else if (mont >= 9 && mont <= 12)
            System.out.println("IV");
        else
            System.out.println("Введите число от 1 - 12");
    }
}
