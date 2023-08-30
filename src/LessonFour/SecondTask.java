package LessonFour;
import  java.util.Scanner;
public class SecondTask {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        System.out.println(" Вторая задача: Площадь круга ");
        System.out.print("Radius ");
        int a = out.nextInt();
        double S = Math.PI*Math.pow(a,2);
        double P = 2 * Math.PI*a;
        System.out.println("ответ площадь = " + S);
        System.out.println("ответ перемтр = " + P);
    }
}
