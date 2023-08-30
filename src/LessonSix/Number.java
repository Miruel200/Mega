package LessonSix;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Задача отгадай число");
        int num1 = (int) (Math.random()*(10 - 1)) + 1;
        int num2 = (int) (Math.random()*(10 - 1)) + 1;
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 * num2 = " + (num1*num2));
        Scanner out = new Scanner(System.in);
        System.out.println("num1 ");
        int userNum1 = out.nextInt();
        System.out.println("num2 ");
        int userNum2 = out.nextInt();
        if ((num1 == userNum1 && num2 == userNum2) || (num1 == userNum2 && num2 == userNum1)) {
            System.out.println("Правильно");
        }else System.out.println(" Не правильно ");

    }
}
