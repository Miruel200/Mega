package Lesson1;
import java.util.Scanner;

public class Verable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите Имя ");
        String name1 = in.nextLine();
        System.out.print("Введите возраст ");
        int age1 = in.nextInt();
        in.nextLine();
        System.out.print("Введите рост ");
        float  var = in.nextFloat();
        in.nextLine();

        System.out.println("Твое Имя  "+name1+" Твой возраст " + age1 + " Твой рост " + var );
        in.close();


    }
}
