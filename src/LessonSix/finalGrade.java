package LessonSix;

import java.util.Scanner;

public class finalGrade {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        System.out.println("Просто число ");
        System.out.println("Введите Х: ");
        int x = out.nextInt();
        System.out.println("Введите У: ");
        int  y = out.nextInt();
      if (x > 0 && y < 0)
          System.out.println("точка находится в IV кординаты");
      else

         System.out.println("Ошибка ");


    }
}
