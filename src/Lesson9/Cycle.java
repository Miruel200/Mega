package Lesson9;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
      /*  System.out.println("задание 5");
        Scanner out = new Scanner(System.in);
        System.out.println("Введите сумму");
        int sum = out.nextInt();
        int summ = 0;
        while (sum > summ){
            System.out.println("Взнос ");
            summ = summ+out.nextInt();
            System.out.println("Вы накопили " + summ);
        }*/
        System.out.println("Шестое задание ");
        Scanner out = new Scanner(System.in);
        System.out.println("Введите значение ");
        int number = out.nextInt();
        for (int i = 5 ; i >= 1; i--){
            System.out.print(i);

        }
    }
}
