package Calculations;
import java.util.Scanner;

public class OperatorType {
    //t = √(2h / g)
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        System.out.println("Время подения со скалы");
        System.out.print("Высота падения ");
        int height = out.nextInt();
        System.out.print("Ускорения свободного падения ");
        int acceleratoin = out.nextInt();
        double fall = Math.sqrt((2 * height / acceleratoin));
        System.out.println("Время падения со скалы составляет: " + fall);

    }
}
