package LesonSeven;

import java.util.Scanner;
import java.util.Random;

public class TrexZnach {
    public static void main(String[] args) {
        System.out.println("Таблица умножения");
        Scanner out = new Scanner(System.in);
          Random rand = new Random();
        int count = 0;
        for (int i = 1; i < 9; i++){
            int num1 = rand.nextInt(9);
            int num2 = rand.nextInt(9);
            int num3 = num1 * num2;
            System.out.println("Вопрос Сколько будет " + num1 + " * " + num2 + " = ");
            int userNumber = out.nextInt();
            if (userNumber == num3) {
                count ++;
                System.out.println("Следующий вопрос");}
            else if (num3 != userNumber)
                System.out.println("Жаль");
            else
                System.out.println("Не коректный ввод");
            }
        System.out.println("Правильных ответов было = " + count + " из 10");

        }
    }

