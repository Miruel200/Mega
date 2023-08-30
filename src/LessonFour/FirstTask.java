package LessonFour;
import java.util.Scanner;
public class FirstTask {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        System.out.println("  Первая задача: Найти Катет и гипотенуза");

        System.out.println("Катет а ");
        int a = out.nextInt();

        System.out.println("Катет b ");
        int b = out.nextInt();

        double c = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
        System.out.println("Гипотенуза " + c );

    }
}
